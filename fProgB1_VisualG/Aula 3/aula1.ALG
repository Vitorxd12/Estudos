Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 21/11/2024

//Operadores l�gicos em condicuinais
//Nos permite usar 2 condi��es em uma estrutura condicional, estabelecendo
//uma rela��o conectando elas

//operadores l�gicos
//e; ou; nao; xou

//e tem que ser os dois verdadeiros
//ou tem que ser pelo menos 1 verdadeiro

Var
   x, y : inteiro

Inicio
   x := 10
   y := 3

   se ((x < 5) ou (y > 1)) entao //Aten��o aos parenteses!!!!
      escreva("ok")
   senao
      escreva("opa")
   fimse

Fimalgoritmo