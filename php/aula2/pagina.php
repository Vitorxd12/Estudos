<?php
// Exemplo de formulário simples em PHP 

 if(isset($_GET['nome']) && isset($_GET['idade'])) {
    // Verifica se o campo 'nome' foi enviado via GET
    $nome = htmlspecialchars($_GET['nome']); //htmlspecialchars para evitar XSS e caracteres especiais]
    $idade = htmlspecialchars($_GET['idade']);
    echo "Olá, " . $nome . "!<br>" . "Sua idade é " . $idade . " anos.";
 }
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h2>Exemplo de form</h2>
    <form action="pagina.php" method="GET"> <!-- action deve ser o nome do arquivo que processa os dados metod post ou get dependendo da função-->
        <label for="nome">Seu nome</label>.
        <input type="text" id="nome" name="nome">
        <label for="idade">Sua idade</label>
        <input type="text" name="idade" id="idade">
        <button type="submit" class="botao">Enviar</button>
    </form>
</body>

</html>