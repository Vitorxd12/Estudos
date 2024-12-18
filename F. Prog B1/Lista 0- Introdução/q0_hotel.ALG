Algoritmo "L0q6"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira 
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 13/11/2024

//06 - Uma pousada deseja fazer uma promoção de fim de semana, concedendo um
//desconto de 30% nadiária. Sendo lidos o número de quartos da pousada (NQP) e o
//valor da diária por apartamento (VDA) (sem desconto),
//elabore um algoritmo para calcular e informar:
//- o valor total arrecadado no fds caso a ocupação seja de 100%;
//- o valor total arrecadado no fds caso a ocupação seja de 60%;

Var
numQuartos, precoQuarto, vlTotalArrec : real


Inicio
escreval("Quantos quartos temos disponiveis para aluguel?")
leia(numQuartos)

escreval("Quanto que a gente cobra por quarto?")
leia(precoQuarto)

vlTotalArrec := precoQuarto * numQuartos

escreval("O valor total arrecadado se a ocupação for de 100% será: ", vlTotalArrec)

escreval("Caso a gente so ocupe 60%, arrecadaremos", (precoQuarto * (numQuartos * 60/100)))

Fimalgoritmo