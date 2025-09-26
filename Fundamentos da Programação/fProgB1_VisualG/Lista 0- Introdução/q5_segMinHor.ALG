Algoritmo "L0q5"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira 
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 11/11/2024

//05 - Elabore um algoritmo que leia uma quantidade de tempo em segundos.
//Ao final informe, este tempo em minutos e horas.
//Exemplo: 7200 segundos = 120 minutos, 2 horas

Var
seg, min, hor : real


Inicio
escreval("escreva o tempo em segundos:")
leia(seg)

min := seg / 60
hor := min / 60

escreval(seg, " segundos são", min:9:2, " minutos ou", hor:9:2, " horas.")


Fimalgoritmo