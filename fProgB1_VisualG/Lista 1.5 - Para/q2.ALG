Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 28/11/2024

//02 - Escreva um algoritmo que leia a proteina preferida (CAR, FRA, QUE) de
//5 pessoas. A seguir informe:
//- quantidade de pessoas que responderam "QUE";
//- percentual de pessoas que responderam "CAR".

Var
   prot, c, repeticoes, carne, queijo, frango: inteiro


Inicio
   c := 0
   repeticoes := 5
   carne := 0
   queijo := 0
   frango := 0
   para c de 1 ate repeticoes faca
      escreval("Qual sua proteina favorita?")
      escreval("Escreva '1' para Carne, '2' para Quijo e '3' para Frango")
      leia(prot)

      se prot = 1 entao
         carne := carne + 1
         escreval("Carne + 1!")
         escreval
      senao
         se prot = 2 entao
            queijo := queijo + 1
            escreval("Queijo + 1!")
            escreval
         senao
            se prot = 3 entao
               frango := frango + 1
               escreval("Frango +1!")
               escreval
            senao
               escreval("Escolha uma proteina válida!")
               escreval
            fimse
         fimse
      fimse
   fimpara

   escreval(carne, " Pessoas escolheram carne, ", frango, " pessoas escolheram frango e ", queijo, " pessoas escolheram queijo.")
   escreval(queijo, " Pessoas escolheram queijo.")
   
   escreval(((carne/repeticoes) * 100),"% das pessoas escolheram carne.")
Fimalgoritmo