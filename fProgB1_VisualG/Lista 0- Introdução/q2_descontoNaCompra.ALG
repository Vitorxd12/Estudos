Algoritmo "L0q2"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira 
// Descri��o   : Leia um pre�o e um desconto, e calcule.
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 11/11/2024
Var
// Se��o de Declara��es das vari�veis 
preco, desconto, precoComDesconto : real

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
escreval("quantos q ta essa brusinha?")
leia(preco)

escreval("tem quantos % de desconto a vista?")
leia(desconto)

precoComDesconto := preco - ((desconto/100) * preco)

escreval("entao, a brusinha de ", preco, " reais, com ", desconto, "% de desconto a vista, fica", precoComDesconto)

Fimalgoritmo