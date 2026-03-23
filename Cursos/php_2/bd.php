<?php

$host = 'localhost';
$db   = 'sistema_exemplo';
$user = 'root';
$pass = '';

try {
    $pdo = new PDO("mysql:host=$host;dbname=$db;charset=utf8", $user, $pass);
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die("Erro na conexão: " . $e->getMessage());
}


if (isset($_POST['salvar'])) {
    $sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
    $pdo->prepare($sql)->execute([$_POST['nome'], $_POST['email']]);
    header("Location: bd.php"); 
}


if (isset($_GET['excluir'])) {
    $sql = "DELETE FROM usuarios WHERE id = ?";
    $pdo->prepare($sql)->execute([$_GET['excluir']]);
    header("Location: bd.php");
}


$usuarios = $pdo->query("SELECT * FROM usuarios ORDER BY id DESC")->fetchAll(PDO::FETCH_ASSOC);
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Gerenciamento de Usuários</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow">
        <div class="card-header bg-primary text-white">
            <h4 class="mb-0">Cadastrar Novo Usuário</h4>
        </div>
        <div class="card-body">
            <form method="POST" class="row g-3">
                <div class="col-md-5">
                    <input type="text" name="nome" class="form-control" placeholder="Nome Completo" required>
                </div>
                <div class="col-md-5">
                    <input type="email" name="email" class="form-control" placeholder="E-mail" required>
                </div>
                <div class="col-md-2">
                    <button type="submit" name="salvar" class="btn btn-success w-100">Adicionar</button>
                </div>
            </form>
        </div>
    </div>

    <div class="card mt-4 shadow">
        <div class="card-body p-0">
            <table class="table table-hover mb-0">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th class="text-center">Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach ($usuarios as $u): ?>
                    <tr>
                        <td><?= $u['id'] ?></td>
                        <td><?= htmlspecialchars($u['nome']) ?></td>
                        <td><?= htmlspecialchars($u['email']) ?></td>
                        <td class="text-center">
                            <a href="?excluir=<?= $u['id'] ?>" 
                               class="btn btn-danger btn-sm" 
                               onclick="return confirm('Deseja excluir este usuário?')">Excluir</a>
                        </td>
                    </tr>
                    <?php endforeach; ?>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>