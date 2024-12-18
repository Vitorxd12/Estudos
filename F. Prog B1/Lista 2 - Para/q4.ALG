Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 03/12/2024

//4 - Elabore um programa que calcula e informe a soma da seguinte série:
//1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
Var
   nmSup, c, rep : inteiro
   soma: real


Inicio

   rep := 50
   nmSup := -1
   para c de 1 ate rep faca
      nmSup := nmSup + 2
      soma := soma + nmSup/c
      escreval (nmSup, " /", c, " = ", (nmSup/c):4:2)
      escreval("A soma é: ", soma:4:2)
   fimpara

Fimalgoritmo