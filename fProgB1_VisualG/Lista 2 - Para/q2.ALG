Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/12/2024

//2 - Desenvolver um programa que leia 20 n�meros. A seguir, calcule e
//informe a m�dia aritm�tica dos valores lidos, a quantidade de valores
//positivos, a quantidade de valores negativos e o percentual de valores
//negativos e positivos.

Var
   media, soma, posi, nega, repReal, por: real
   i, rep, num : inteiro

Inicio

   num := 0
   rep := 20
   soma := 0
   posi := 0
   nega := 0
   repReal := rep

   para i de 1 ate rep faca
      escreval("Escreva um n�mero")
      num := randi(100) - 50
      escreval(num)
      soma := num + soma

      se num > 0 entao
         posi := posi + 1
      senao
      nega := nega +1
      fimse
   fimpara

   media := soma / rep
   escreval("A m�dia aritimedica dos n�meros �: ", media)
   escreval("Houveram ", posi, " valores positivos e ", nega, " valores negativos.")
   escreval((posi * 100) /rep], "% dos valores eram positivos e " ,(nega * 100) /rep, "% dos valores eram negativos.")
Fimalgoritmo