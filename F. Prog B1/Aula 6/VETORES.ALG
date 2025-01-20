Algoritmo "Vetores"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira 
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 20/01/2025

// A aula de hoje é vetores, e quando concluirmos, partiremos para java.
//imagine que vc precis salvar 4 turmas, de 30 alunos cada, com 3 notas
//para cada aluno. sem fazer listas, ia ser necessario 360 variaveis. usando
//vetores, podemos simplificar essa logica.

//Vetor: uma variavel que pode armazernar varios valores ao mesmo tempo.

//Um vetor é composto por elementos e indices. o elementos seria o
//valor em si, e o indice seria o endereço no qual este valor esta guardado
//é necessario dizer o tamanho do vetor quando se é declarado.
//indices tambem podem ser chamados de posição. tanto faz

//tal qual variaveis comins, também é necessario dizer qual o tipo de dados
//que serão armazenados no vetor.

//o professor também pediu pra nomear os vetorese com a letra V antes

Var
// SINTAXE
//nome do vetor : vetor[(inicio)..(fim)] de (tipo de variavel)
vNotas : vetor[1..5] de inteiro
//LEMBRE DOS DOIS PONTOS



Inicio
//Atribuindo um valor a um indice de um vetor
//nome do vetor [indice] : valor
vNotas[1] := 5
escreval(vNotas[1])


Fimalgoritmo