Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 09/12/2024

//02 - Elabore um programa para ler diversos movimentos de uma conta corrente.
//Para cada movimento dever ser informado o tipo da opera��o (D-D�bito ou
//C-Cr�dito) e o valor da opera��o. Ao final, informe o saldo final ap�s as
//diversas movimenta��es. Finalize a leitura de dados com o tipo de movimento
//igual a �Z�.

Var
   saldo, trans : real
   tipMov : caractere



Inicio
   saldo := 0

   enquanto maiusc(tipMov) <> "Z" faca

      escreval("Digite o valor desta transa��o")
      leia(trans)
      saldo := saldo + trans
      
      escreval("Qual o tipo de movimento que ser� feito?")
      escreval("(D - D�bito ou C - Cr�dito)")
      leia(tipMov)

   fimenquanto
   escreval(saldo)

Fimalgoritmo