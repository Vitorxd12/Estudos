Algoritmo "L1q5"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 25/11/2024

//05 - Elabore um programa que leia 3 números de 3 dígitos (100 a 999) e a
//operação que o usuário deseja realizar conforme abaixo. Execute a operação
//desejada e imprima na tela. (Utilizar ocomando escolha).

//Opção Objetivo
//1 Somar o número de centenas dos 3 números
//2 Somar o número de dezenas dos 3 números
//3 Somar o número de unidades dos 3 números

//Exemplo:
//Números lidos: 816, 249, 305
//Opção 1: 8+2+3 = 13
//Opção 2: 1+4+0 = 5
//Opção 3: 6+9+5 = 20


Var
menu, num1, num2, num3, resul : inteiro

Inicio
escreval("Digite um numero de 3 digitos (do 100 ao 999)")
leia(num1)
escreval("Digite outro numero de 3 digitos (do 100 ao 999)")
leia(num2)
escreval("Digite mais numero de 3 digitos (do 100 ao 999)")
leia(num3)

escreval("Para os números informados, digite 1 para somar suas centenas, ou digite 2 para somar as dezenas, ou digite 3 para somar as unidades.")
leia(menu)

escolha (menu)
caso 1
num1 := num1 \ 100
num2 := num2 \ 100
num3 := num3 \ 100
resul := num1 + num2 + num3
escreval("  Primeiro número: ",num1, "  Segundo número: ",num2, "  Terceiro número: ",num3, "  Soma dos números:",resul)

caso 2
num1 := (num1 \ 10) mod 10
num2 := (num2 \ 10) mod 10
num3 := (num3 \ 10) mod 10
resul := num1 + num2 + num3
escreval("  Primeiro número: ",num1, "  Segundo número: ",num2, "  Terceiro número: ",num3, "  Soma dos números:",resul)

caso 3
num1 := num1 mod 10
num2 := num2 mod 10
num3 := num3 mod 10
resul := num1 + num2 + num3
escreval("  Primeiro número: ",num1, "  Segundo número: ",num2, "  Terceiro número: ",num3, "  Soma dos números:",resul)
fimescolha

Fimalgoritmo
