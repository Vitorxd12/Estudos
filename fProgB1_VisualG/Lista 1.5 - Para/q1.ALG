Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 28/11/2024

//01 - Escreva um algoritmo que leia o saldrio de 5 pessoas. A seguir, informe:
//- m�dia de sal�rios
//- o maior saldrio
Var
   contador, repeticoes : inteiro
   salario, salarioRecorde, media, soma : real


Inicio

   contador := 0
   repeticoes := 5
   salarioRecorde := 0

   para contador de 1 ate repeticoes faca
      escreval("Qual o sal�rio do funcionario?")
      leia(salario)
      soma := soma + salario
      
      se salario > salarioRecorde entao
         salarioRecorde := salario
      fimse
   fimpara
   
   
   media := soma / repeticoes
   escreval("A media dos sal�rios �: ", media)
   escreval("O maior sal�rio foi: ", salarioRecorde)

Fimalgoritmo