Algoritmo "L0q2"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira 
// Descrição   : Leia um preço e um desconto, e calcule.
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 11/11/2024
Var
// Seção de Declarações das variáveis 
preco, desconto, precoComDesconto : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("quantos q ta essa brusinha?")
leia(preco)

escreval("tem quantos % de desconto a vista?")
leia(desconto)

precoComDesconto := preco - ((desconto/100) * preco)

escreval("entao, a brusinha de ", preco, " reais, com ", desconto, "% de desconto a vista, fica", precoComDesconto)

Fimalgoritmo