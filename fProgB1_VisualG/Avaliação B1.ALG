Algoritmo "avaliacao1_vitor_oliveira"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias, BSI 2024.2
// Data atual  : 12/12/2024

//Primeira Avaliação de Fundamentos da Progamação.

Var
   ida, numFil, peso, i, menorIda, numObesos, rep, numIdoSemFil, maiorPeso, cont : inteiro
   percObesos, percIdoSemFil : real


Inicio
   //Inicialização das variaveis
   rep := 1
   i := 0
   cont := 1
   ida := 0
   numFil := 0
   peso := 0
   menorIda:= 91
   numObesos := 0
   numIdoSemFil := 0
   maiorPeso := 0


   escreval(" IDA    NUMFIL   PESO")
   escreval(" --------------------")

   //Loop para a coleta de dados
   para i de 1 ate rep faca
      ida := randi(81) + 10
      numFil := randi(6)
      peso := randi(91) + 30
      escreval(ida,"      ", numFil, "      ", peso)
      se ida < menorIda entao
         menorIda := ida
      fimse
      se peso > 90 entao
         numObesos := numObesos + 1
      fimse
      se ((ida > 65) e (numFil = 0)) entao
         numIdoSemFil := numIdoSemFil + 1
      fimse
      se peso > maiorPeso entao
         maiorPeso := peso
      fimse
   fimpara

   //Processamento de dados
   percObesos :=  numObesos * 100 / rep
   percIdoSemFil := numIdoSemFil * 100 / rep

   //Relatorio
   escreval()
   escreval("Menor Idade:                       :",menorIda," Anos")
   escreval("Perc. Obesas                       :",percObesos, "%")
   escreval("Perc. Idosos Sem Filhos            :",percIdoSemFil, "%")
   escreval("Divisores do maior peso (",maiorpeso," kg ) :" )

   //Divisores do maior peso
   enquanto (cont - 1) < maiorPeso faca
      se (maiorPeso % cont) = 0 entao
         escreva(maiorPeso / cont)
      fimse
      cont := cont + 1
   fimenquanto

Fimalgoritmo