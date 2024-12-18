Algoritmo "L0q1"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira 
// Descrição   : Média ponderada de 3 notas
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 11/11/2024
Var
// Seção de Declarações das variáveis 
nota1, nota2, nota3, media: real


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Qual a primeira nota do aluno?")
leia(nota1)

escreval("Qual a segunda nota do aluno?")
leia(nota2)

escreval("Qual a terceira nota do aluno?")
leia(nota3)

media := (nota1 + nota2 + nota3) /3
escreval(media:2:2)

Fimalgoritmo