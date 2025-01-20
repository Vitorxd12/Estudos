Algoritmo "VetorPara"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 20/01/2025

//Vetor sem laço de repetição é zero.
//são dois assunots profundamente interligados interligados.
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
//CONSIDERAÇÕES IMPORTANTES
//1-
//tenha atençao com o indice do vetor, pra vc não se perdr
//quando as coisas estiverem dando errado, cheque primeiro o indice

//2- as vezes a gente preenche o vetor, mas as vezes a gente vai percorre-lo
//ler de um em um e fazer uma breve analise de dados. para ver se o numero do
//indice é par ou impar, vc percorre o vetor, usando um para e um se para fazer
//as checagens necessarias

//3- é proibido buracos vazios evite vãos sem infomações entre indices. do
//meio pra o final é aceitavel.
//é comum que as vezes vc so prencha o ultimo indicie, mas isso ta errado