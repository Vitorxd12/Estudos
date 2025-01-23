Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 23/01/2025

//Gere um vetor (v) de de 5 numeros até 20
//Ache o menor numero de V
//Crie um vetor M, e preencha-o com com a multriplicação do menor valor de v
Var
   v, m : vetor[1..5] de inteiro
   constante, i, mNum: inteiro


Inicio
   mNum := 0
   constante := 5
   
   escreval("Valores de V:")
   para i de 1 ate constante faca
      v[i] := randi(21)
      se (v[i] < mNum) ou (mNum = 0) entao
         mNum := v[i]
      fimse
      escreva(v[i]:5)
   fimpara
   escreval("Menor número em V: ", mNum)
   
   escreval("Valores de V * Menor número")
   para i de 1 ate constante faca
      m[i] := v[i] * mNum
      escreva(m[i]:5)
   fimpara


Fimalgoritmo