Algoritmo "VetorPara"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 20/01/2025

//Vetor sem la�o de repeti��o � zero.
//s�o dois assunots profundamente interligados interligados.
Var
   vNumeros : vetor[1..10] de inteiro
   i : inteiro


Inicio
   para i de 1 ate 10 faca
      vNumeros[i] := randi(9)
   fimpara

   para i de 1      ate 10 faca
      escreval(i, ":" ,vNumeros[i])
   fimpara


Fimalgoritmo
//CONSIDERA��ES IMPORTANTES
//1-
//tenha aten�ao com o indice do vetor, pra vc n�o se perdr
//quando as coisas estiverem dando errado, cheque primeiro o indice

//2- as vezes a gente preenche o vetor, mas as vezes a gente vai percorre-lo
//ler de um em um e fazer uma breve analise de dados. para ver se o numero do
//indice � par ou impar, vc percorre o vetor, usando um para e um se para fazer
//as checagens necessarias

//3- � proibido buracos vazios evite v�os sem infoma��es entre indices. do
//meio pra o final � aceitavel.
//� comum que as vezes vc so prencha o ultimo indicie, mas isso ta errado