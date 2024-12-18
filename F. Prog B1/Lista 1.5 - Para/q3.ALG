Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 28/11/2024

//03 - Escreva um algoritmo que leia o sexo (F, M) e o
//estado de nascimento (sigla) de 5 pessoas. A seguir, informe:
//- total de sergipanos
//- entre as mulheres, o percentual de mulheres baianas

Var
   estado, sexo : caractere
   i, repeticoes, sergipanos, mulheresBaianas, mulheres : inteiro

Inicio

   repeticoes := 2
   para i de 1 ate repeticoes faca
      escreval("Qual o seu sexo (F)(M)")
      leia(sexo)
      escreval("Qual a sigla do seu estado?")
      leia(estado)

      se maiusc(estado) = "SE" entao
         sergipanos := sergipanos +1
      fimse

      se maiusc(sexo) = "F" entao
         mulheres := mulheres + 1
      fimse

      se (maiusc(sexo) = "F") e (maiusc(estado) = "BA") entao
         mulheresBaianas := mulheresBaianas + 1
      fimse
   fimpara
   escreval("Há ", sergipanos," segipanos na pesquisa.")
   escreval("Há ", mulheres," mulheres na pesquisa. destas,", mulheresBaianas," são baianas.")
Fimalgoritmo