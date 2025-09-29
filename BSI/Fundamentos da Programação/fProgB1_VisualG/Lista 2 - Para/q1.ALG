Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 02/12/2024

//1 - Elabore um programa que leia 10 números e informe quantos desses
//números estão entre 20 e 50.
Var
   c, num, total : inteiro


Inicio
   para c de 1 ate 10 faca
      escreval("Digite um número")
      leia(num)
      escreval()

      se ((num > 20)ou(num < 50)) entao
         total := total + 1
         escreval("+1")
         
      fimse
   fimpara
   escreval("Houveram ", total, " números entre 20 e 50")

Fimalgoritmo