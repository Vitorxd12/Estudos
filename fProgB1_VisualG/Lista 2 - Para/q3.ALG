Algoritmo "L2q3"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 03/12/2024

//3 - Foi feita uma pesquisa entre os habitantes de uma regi�o e coletados os
//dados de altura e sexo (�F�, �M�) das pessoas.
//Elabore um programa que leia 50 dados diferentes e
//informe: a maior altura encontrada, a m�dia de altura das mulheres,
//a m�dia de altura da popula��o e o percentual de homens na popula��o.


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
   escreval("A m�dia de todas as alturas �: ", somaAlt / rep)
   escreval("A m�dia das alturas das mulheres �: ",somaAltF / rep)
   escreval("A maior altura encontrada foi: ",altMax )
   escreval((qtdH * 100 / rep), "% do grupo � masculino")
Fimalgoritmo