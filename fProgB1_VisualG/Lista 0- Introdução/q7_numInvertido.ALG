Algoritmo "L0q7"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira 
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 12/11/2024

//07 - Elabore um algoritmo para ler um n�mero de 2 d�gitos.
//A seguir, informe o n�mero invertido.
//Exemplo: 29 > 92

Var
dig1, dig2, num, res : inteiro


Inicio

escreval("Escreva um numero de 2 digitos.")
leia(num)

dig1 := num \ 10 //a barra invertida divide por inteiro
dig2 := num % 10

escreval(dig2:1, dig1:1)


Fimalgoritmo