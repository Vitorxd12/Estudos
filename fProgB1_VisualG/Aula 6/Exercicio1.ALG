Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 23/01/2025

//Gere um vetor (v) de de 5 numeros at� 20
//Ache o menor numero de V
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
   escreval("Menor n�mero em V: ", mNum)
   
   escreval("Valores de V * Menor n�mero")
   para i de 1 ate constante faca
      m[i] := v[i] * mNum
      escreva(m[i]:5)
   fimpara


Fimalgoritmo