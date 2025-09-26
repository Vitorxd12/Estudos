Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 03/12/2024

//5 - Elabore um programa que calcula e informe a soma dos 20 primeiros
//termos da seguinte série:
//1/1 - 2/3 + 3/5 - 4/7 + 5/9 ...
Var
   c, rep : inteiro
   nmSup, nmInf, soma, frac: real


Inicio

   rep := 20
   nmSup := 1
   nmInf := 1
   soma :=0

   para c de 1 ate rep faca
      escreval(nmSup," / ", nmInf," = ", (nmSup/nmInf):4:2)
      soma := soma + (nmSup/nmInf)
      nmInf := nmInf + 2
      nmSup := nmSup  * -1
      se nmSup > 1 entao
         nmSup:= nmSup + 1
      senao
         nmSup := nmSup -1
      fimse
   fimpara
   escreval("A soma dos termos é: ", soma:4:2)
Fimalgoritmo