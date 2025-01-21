Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Olivelira Costa Dias
// Data atual  : 09/12/2024

//01 - Desenvolver um programa que leia a altura de um conjunto de pessoas.
//Este programa deverá calcular e mostrar: o percentual de pessoas com altura
//menor ou igual 1.70 e o percentual com altura maior que 1.70. Finalize a
//leitura de dados com uma altura negativa.
Var
   altura, contMaior, contMenor, cont : real


Inicio
   contMenor := 0
   contMaior := 0
   cont := 0

   escreval("Digite a altura, em centimetros")
   leia(altura)

   enquanto altura > 0 faca
      cont := cont + 1
      
      se altura > 170 entao
         contMaior := contMaior + 1
      senao
         contMenor := contMenor + 1
      fimse

      escreval("Digite a altura, em centimetros")
      leia(altura)
   fimenquanto

   escreval((contMenor/cont)*100, "% das pessoas são menores que 1.70")
   escreval((contMaior/cont)*100, "% das pessoas são maiores que 1.70")
Fimalgoritmo

//KARAI ESSE FOI PEDRADA