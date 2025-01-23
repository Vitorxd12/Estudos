Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 23/01/2025

//Em uma competição de ginástica, cada atleta recebe votos de sete jurados.
//A melhor e a pior nota são eliminadas. A sua nota fica sendo a média dos
//votos restantes.

//Elabore um programa que leia as notas dos sete jurados
//(vetor vNotas) alcançadas pelo atleta em sua apresentação e depois
//adicione em um vetor (vNotasValidas) somente as notas válidas para o
//cálculo da média, conforme regras acima.

//vNotas: 9.0 7.5 9.5 8.5 9.0 9.7 9.5
//vNotasValidas: 9.0 9.5 8.5 9.0 9.5
//Média: 9.1
Var
   vNotas, vNotasValidas : vetor[1..7] de real
   media, maiorNota, menorNota : real
   c, nJurados : inteiro

Inicio
   nJurados := 3
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
      escreval(maiorNota, menorNota)
   fimpara
   
   para c de 1 ate nJurados faca
       se (vNotas[c] = maiorNota) ou (vNotas[c] = menorNota) entao

       fimse
   fimpara


Fimalgoritmo