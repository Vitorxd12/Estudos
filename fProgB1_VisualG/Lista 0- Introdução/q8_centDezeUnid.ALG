Algoritmo "L0q8"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira 
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 12/11/2024

//08 - Elabore um algoritmo para ler um n�mero de 3 d�gitos.
//A seguir, informe o n�mero de centenas, dezenas e unidades.


Var
num, cent, deze, unid : inteiro

Inicio
escreval("Digite um n�mero")
leia(num)

cent := num \ 100
deze := (num % 100) \ 10
unid := num % 10


escreval("O n�mero", num, " possui", cent, " centenas,", deze:0:2, " dezenas e", unid, " unidades.")



Fimalgoritmo