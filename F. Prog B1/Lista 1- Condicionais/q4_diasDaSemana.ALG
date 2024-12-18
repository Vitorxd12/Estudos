Algoritmo "q4L1"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 21/11/2024

//Elabore um progama que receba como entrada um numero inteiro que represente
//um dos 7 dias da semana. me diga se é um dia da semana, um fim de semana,
//ou um numero invalido. domingo é um e sábado é 7.
Var
   dia : inteiro


Inicio
   escreval("Que dia é hoje? (Escreva de um a sete, sendo 1 domingo e 7 sábado)")
   leia(dia)

   se ((dia > 7) ou (dia < 1)) entao
      escreval("Escolha um valor válido!")
   senao
      se ((dia = 1) ou (dia = 7)) entao
         escreval("Bom fim de semana")
      senao
         escreval("Te vejo no trabalho.")
      fimse
   fimse
Fimalgoritmo