Algoritmo "L0q3"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira 
// Descrição   : Calcule a media ponderada de 4 notas com pesos 2, 2, 4, 5
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/11/2024
Var
// Seção de Declarações das variáveis 
nota1, nota2, nota3, nota4, media : real
peso1, peso2, peso3, peso4, somaPesos : inteiro

Inicio
peso1 := 2
peso2 := 2
peso3 := 4
peso4 := 5
somaPesos := peso1 + peso2 + peso3 + peso4

escreval("Qual a primeira nota do aluno?")
leia(nota1)

escreval("Qual a segunda nota do aluno?")
leia(nota2)

escreval("Qual a terceira nota do aluno?")
leia(nota3)

escreval("Qual a quarta nota do aluno?")
leia(nota4)

media := ((nota1 * peso1)+(nota2 * peso2)+(nota3 * peso3)+(nota4 * peso4)) / somaPesos

escreval(media:9:2)

Fimalgoritmo