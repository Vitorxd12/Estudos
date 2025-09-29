Algoritmo "L2q3"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 03/12/2024

//3 - Foi feita uma pesquisa entre os habitantes de uma região e coletados os
//dados de altura e sexo (“F”, “M”) das pessoas.
//Elabore um programa que leia 50 dados diferentes e
//informe: a maior altura encontrada, a média de altura das mulheres,
//a média de altura da população e o percentual de homens na população.


Var
   sexo: caractere
   alt, altMax, somaAltF, somaAlt : real
   i, rep, qtdH : inteiro


Inicio

   rep := 5
   para i de 1 ate rep faca
      escreval("Digite sua altura em centimetros.")
      alt := randi(40) + 150
      escreval(alt)
      somaAlt := somaAlt + alt //Soma de todas as alturas

      escreval("Qual o seu sexo? (M ou F)")
      leia(sexo)
      sexo := maiusc(sexo)
      
      se sexo =  "M" entao
         qtdH := qtdH + 1
      fimse
      
      se sexo = "F" entao //Soma das alturas das mulheres
         somaAltF := somaAltF + alt
      fimse

      se alt > altMax entao //Altura mais alta
         altMax := alt
      fimse
   fimpara
   escreval("A média de todas as alturas é: ", somaAlt / rep)
   escreval("A média das alturas das mulheres é: ",somaAltF / rep)
   escreval("A maior altura encontrada foi: ",altMax )
   escreval((qtdH * 100 / rep), "% do grupo é masculino")
Fimalgoritmo