Algoritmo "L0q8"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira 
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 12/11/2024

//08 - Elabore um algoritmo para ler um número de 3 dígitos.
//A seguir, informe o número de centenas, dezenas e unidades.


Var
num, cent, deze, unid : inteiro

Inicio
escreval("Digite um número")
leia(num)

cent := num \ 100
deze := (num % 100) \ 10
unid := num % 10


escreval("O número", num, " possui", cent, " centenas,", deze:0:2, " dezenas e", unid, " unidades.")



Fimalgoritmo