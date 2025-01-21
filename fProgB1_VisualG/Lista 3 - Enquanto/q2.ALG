Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 09/12/2024

//02 - Elabore um programa para ler diversos movimentos de uma conta corrente.
//Para cada movimento dever ser informado o tipo da operação (D-Débito ou
//C-Crédito) e o valor da operação. Ao final, informe o saldo final após as
//diversas movimentações. Finalize a leitura de dados com o tipo de movimento
//igual a “Z”.

Var
   saldo, trans : real
   tipMov : caractere



Inicio
   saldo := 0

   enquanto maiusc(tipMov) <> "Z" faca

      escreval("Digite o valor desta transação")
      leia(trans)
      saldo := saldo + trans
      
      escreval("Qual o tipo de movimento que será feito?")
      escreval("(D - Débito ou C - Crédito)")
      leia(tipMov)

   fimenquanto
   escreval(saldo)

Fimalgoritmo