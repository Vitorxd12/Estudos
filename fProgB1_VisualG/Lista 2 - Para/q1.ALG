Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 02/12/2024

//1 - Elabore um programa que leia 10 n�meros e informe quantos desses
//n�meros est�o entre 20 e 50.
Var
   c, num, total : inteiro


Inicio
   para c de 1 ate 10 faca
      escreval("Digite um n�mero")
      leia(num)
      escreval()

      se ((num > 20)ou(num < 50)) entao
         total := total + 1
         escreval("+1")
         
      fimse
   fimpara
   escreval("Houveram ", total, " n�meros entre 20 e 50")

Fimalgoritmo