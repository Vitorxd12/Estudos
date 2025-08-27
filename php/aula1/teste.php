<?php
echo "Hello, World! <br>"; //tags html funcionam igual em strings
echo "php <br>";

//variaveis em php - são inteligentes como as de phyton "variavel tipada"
$nome = "Vitor";
$sobrenome = "Oliveira";
echo "meu nome é $nome" . "e meu sobrenome é $sobrenome<br>"; // use o ponto para concatenar strings
$nomecompleto = $nome . " " . $sobrenome;
echo "meu nome completo é $nomecompleto<br>";

//float
$altura = 1.75;
echo "minha altura é" . $altura . "<br>";

//array pre progamada
$array = ["item 1", "item 2", "item 3"];

//adicionar item ao array
$array[] = "item 4"; //adiciona no final do array
$array[0] = "item 1 modificado"; //modifica o primeiro item do array

//if bizarro
echo "igualdade " . (20 == 20 ? "verdadeiro" : "falso") . "<br>";
//se verdadeiro, retorna logo depois da interrogação, se falso, retorna depois dos dois pontos
//proposição ? v : f - é tipo uma pergunta com duas respostas

// = atribuição
// == comparação
// === identidco, comparaçao de tipo e valor. int e stringo pode ter o mesmo valor, mas são tipos diferentes
//!= negação, inverte o valor lógico


//operadores lógicos
// && e - and
// || ou - or
// ! negação - not
//< || >
//igual java

$idade = 20;
$habilitado = true;
if ($idade >= 18 && $habilitado) {
    echo "pode dirigir";
} else {
    echo "não pode dirigir";
}

echo "<br> é maior de idade? " . ($idade >= 18 ? "sim" : "não") . "<br>";

//for
for ($i = 0; $i < 10; $i++) {
    echo $i;
}
echo "<br>";

//while
$contador = 9;
while ($contador >= 0) {
    echo $contador;
    $contador--;
}

//foreach
echo "itens da array:<br>"; //array declarada la atras
foreach ($array as $i) {
    echo $i . "<br>";
}

//listas associativas - array com chaves e valores
$associativa = [
    "vitor" => 1000,
    "joão" => 2000,
    "maria" => 3000,
];
//para cada item de $associativa, $nome é a chave e $salario é o valor
foreach ($associativa as $nome => $salario) {
    echo "chave: $nome, valor: $salario <br>";
}

//funçoes

function helloWorld($nome): void{
    echo "Hello World! <br>";
}
helloWorld("Vitor");

//função com retorno
function soma($a, $b): int {
    return $a + $b;
}
echo $resultado = soma(10, 20);

//exite funões prontas, tipo metodos no java, mas não usa os pontos - built in functions

echo "o nome de vitor tem esse tanto de letras" . strlen("Vitor") . "<br>"; //tamanho da string
