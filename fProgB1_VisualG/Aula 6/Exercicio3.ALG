Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 23/01/2025

//Em uma competi��o de gin�stica, cada atleta recebe votos de sete jurados.
//A melhor e a pior nota s�o eliminadas. A sua nota fica sendo a m�dia dos
//votos restantes.

//Elabore um programa que leia as notas dos sete jurados
//(vetor vNotas) alcan�adas pelo atleta em sua apresenta��o e depois
//adicione em um vetor (vNotasValidas) somente as notas v�lidas para o
//c�lculo da m�dia, conforme regras acima.

//vNotas: 9.0 7.5 9.5 8.5 9.0 9.7 9.5
//vNotasValidas: 9.0 9.5 8.5 9.0 9.5
//M�dia: 9.1
Var
   vNotas, vNotasValidas : vetor[1..7] de real
   media, maiorNota, menorNota, soma : real
   c, nJurados : inteiro

Inicio
   nJurados := 7
   maiorNota := 0
   menorNota := 0

   para c de 1 ate nJurados faca
      escreva("Nota do jurado", c,": ")
      leia(vNotas[c])
      se (vNotas[c] < menorNota) ou (menorNota = 0) entao
         menorNota := vNotas[c]
      fimse
      se (vNotas[c] > maiorNota) entao
         maiorNota := vNotas[c]
      fimse
   fimpara
   escreval()
   escreval("A maior nota foi: ", maiorNota)
   escreval("A menor nota foi: ", menorNota)
   escreval("Notas v�lidas: ")
   para c de 1 ate nJurados faca
      se (vNotas[c] = maiorNota) ou (vNotas[c] = menorNota) entao
      senao
           vNotasValidas[c] := vNotas[c]
           escreva(vNotasValidas[c]:4:1)
           soma := soma + vNotasValidas[c]
      fimse
   fimpara
   escreval()
   escreval("A m�dia de todas as notas v�lidas foi: ", soma/(c-2))

Fimalgoritmo