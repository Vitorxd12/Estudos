Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 21/11/2024

//Operadores lógicos em condicuinais
//Nos permite usar 2 condições em uma estrutura condicional, estabelecendo
//uma relação conectando elas

//operadores lógicos
//e; ou; nao; xou

//e tem que ser os dois verdadeiros
//ou tem que ser pelo menos 1 verdadeiro

Var
   x, y : inteiro

Inicio
   x := 10
   y := 3

   se ((x < 5) ou (y > 1)) entao //Atenção aos parenteses!!!!
      escreva("ok")
   senao
      escreva("opa")
   fimse

Fimalgoritmo