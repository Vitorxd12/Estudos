Algoritmo "Vetores"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira 
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 20/01/2025

// A aula de hoje � vetores, e quando concluirmos, partiremos para java.
//imagine que vc precis salvar 4 turmas, de 30 alunos cada, com 3 notas
//para cada aluno. sem fazer listas, ia ser necessario 360 variaveis. usando
//vetores, podemos simplificar essa logica.

//Vetor: uma variavel que pode armazernar varios valores ao mesmo tempo.

//Um vetor � composto por elementos e indices. o elementos seria o
//valor em si, e o indice seria o endere�o no qual este valor esta guardado
//� necessario dizer o tamanho do vetor quando se � declarado.
//indices tambem podem ser chamados de posi��o. tanto faz

//tal qual variaveis comins, tamb�m � necessario dizer qual o tipo de dados
//que ser�o armazenados no vetor.

//o professor tamb�m pediu pra nomear os vetorese com a letra V antes

Var
// SINTAXE
//nome do vetor : vetor[(inicio)..(fim)] de (tipo de variavel)
vNotas : vetor[1..5] de inteiro
//LEMBRE DOS DOIS PONTOS
x : inteiro


Inicio
//Atribuindo um valor a um indice de um vetor
//nome do vetor [indice] : valor
vNotas[1] := 5
escreval(vNotas[1])


//� possivel usar variaveis na hora de escrever o indice
vNotas[2] := 3
x := 2
escreval(vNotas[x])

//� possivel usar leia com vetores
escreval("Digite uma nota")
leia(vNotas[3])
escreval(vNotas[3])



Fimalgoritmo