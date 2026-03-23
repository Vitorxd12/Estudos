<?php
$file = 'data.json';

// Initialize data file
if (!file_exists($file)) {
    file_put_contents($file, json_encode([]));
}

$action = $_GET['action'] ?? 'list'; 
$data = json_decode(file_get_contents($file), true); // Load data from JSON

if ($_SERVER['REQUEST_METHOD'] === 'POST') { 
    if ($action === 'create') {
        $newEntry = [
            'id' => time(),
            'title' => $_POST['title'],
            'description' => $_POST['description']
        ];
        $data[] = $newEntry;
        file_put_contents($file, json_encode($data));
        header('Location: index.php');
    } elseif ($action === 'update') {
        $id = $_POST['id'];
        foreach ($data as &$entry) {
            if ($entry['id'] == $id) {
                $entry['title'] = $_POST['title'];
                $entry['description'] = $_POST['description'];
            }
        }
        file_put_contents($file, json_encode($data));
        header('Location: index.php');
    }
}

if ($action === 'delete') {
    $id = $_GET['id'];
    $data = array_filter($data, fn($e) => $e['id'] != $id);
    file_put_contents($file, json_encode(array_values($data)));
    header('Location: index.php');
}

$editItem = null;
if ($action === 'edit' && isset($_GET['id'])) {
    $id = $_GET['id'];
    foreach ($data as $item) {
        if ($item['id'] == $id) {
            $editItem = $item;
            break;
        }
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CRUD</title>
    <style>
        body { font-family: Arial; margin: 20px; }
        table { border-collapse: collapse; width: 100%; }
        th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }
        th { background-color: #f4f4f4; }
        form { margin: 20px 0; }
        input { padding: 5px; margin: 5px 0; width: 200px; }
        button { padding: 5px 10px; cursor: pointer; }
    </style>
</head>
<body>
    <h1>CRUD</h1>
    
    <form method="POST" action="?action=<?= $editItem ? 'update' : 'create' ?>">
        <?php if ($editItem): ?>
            <input type="hidden" name="id" value="<?= $editItem['id'] ?>">
        <?php endif; ?>
        <input type="text" name="title" placeholder="Title" value="<?= $editItem['title'] ?? '' ?>" required>
        <input type="text" name="description" placeholder="Description" value="<?= $editItem['description'] ?? '' ?>" required>
        <button type="submit"><?= $editItem ? 'Update' : 'Create' ?></button>
    </form>

    <table>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Actions</th>
        </tr>
        <?php foreach ($data as $item): ?>
        <tr>
            <td><?= htmlspecialchars($item['title']) ?></td>
            <td><?= htmlspecialchars($item['description']) ?></td>
            <td>
                <a href="?action=edit&id=<?= $item['id'] ?>">Edit</a>
                <a href="?action=delete&id=<?= $item['id'] ?>" onclick="return confirm('Delete?')">Delete</a>
            </td>
        </tr>
        <?php endforeach; ?>
    </table>
</body>
</html>