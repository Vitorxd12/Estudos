Algoritmo "q4L1"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 21/11/2024

//Elabore um progama que receba como entrada um numero inteiro que represente
//um dos 7 dias da semana. me diga se � um dia da semana, um fim de semana,
//ou um numero invalido. domingo � um e s�bado � 7.
Var
   dia : inteiro


Inicio
   escreval("Que dia � hoje? (Escreva de um a sete, sendo 1 domingo e 7 s�bado)")
   leia(dia)

   se ((dia > 7) ou (dia < 1)) entao
      escreval("Escolha um valor v�lido!")
   senao
      se ((dia = 1) ou (dia = 7)) entao
         escreval("Bom fim de semana")
      senao
         escreval("Te vejo no trabalho.")
      fimse
   fimse
Fimalgoritmo