Algoritmo "L1q1"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 21/11/2024

//01 - Elabore um programa que leia o valor de um produto e quantidade de
//parcelas a serem pagas no cr�dito. A seguir, calcule o valor final do produto
//considerando as regras abaixo:

//N�mero de Parcelas - Juros
//1 - 0%
//2 - 5%
//3 - 10%

Var
   nmParcelas, vlProduto : real


Inicio
   escreval("Insira o valor do produto")
   leia(vlProduto)

   escreval("Escolha o n�mero de parcelas, de 1 a 3.")
   leia(nmParcelas)

   se ((nmParcelas > 3) ou (nmParcelas < 1)) entao
      escreval("Escolha um valor v�lido!")
   senao
      se nmParcelas = 1 entao
         escreval("Como pra uma vez s� n�o tem juros, o valor contiua o mesmo,", vlProduto)

      senao
         se nmParcelas = 2 entao
            escreval("Pra duas vezes, tem um juros de 5%, ent�o o valor fica", (vlProduto * 1.05))
         senao
            escreval("Pra tr�s vezes, tem um juros de 10%, ent�o o valor fica", (vlProduto * 1.1))
         fimse
      fimse
   fimse

Fimalgoritmo