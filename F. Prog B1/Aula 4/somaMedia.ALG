Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira 
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 25/11/2024
Var
soma, nota, c : inteiro
media : real


Inicio

soma := 0 //lembre de inicializar a variavel com zero pq outras linguages vai dar null

para c de 1 ate 4 faca
     nota := randi(10)
     escreval(nota)
     soma := soma + nota
fimpara
media := soma / c
escreval("Média:  ",media)


Fimalgoritmo