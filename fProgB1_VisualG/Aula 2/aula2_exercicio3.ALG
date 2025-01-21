Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/11/2024
Var
   // Seção de Declarações das variáveis
   chutTime1, golsTime1, chutTime2, golsTime2 : inteiro
   precisaoTime1, precisaoTime2 : real

Inicio

   //Leitura do time 1
   escreval("Quantos chutes ao gol o Flamengo fez esse ano?")
   leia(chutTime1)
   escreval("Quantos gols o Flamengo fez esse ano?")
   leia(golsTime1)

   //Leitura do time 2
   escreval("Quantos chutes ao gol o Vasco fez esse ano?")
   leia(chutTime2)
   escreval("Quantos gols o Vasco fez esse ano?")
   leia(golsTime2)

   //Analise de dados
   precisaoTime2 := (golsTime2 / chutTime2)  * 100
   escreval("O Vasco teve ", precisaoTime2:3:2, "% de acerto")
   precisaoTime1 := (golsTime1 / chutTime1)  * 100
   escreval("O Flamengo teve ", precisaoTime1:3:2, "% de acerto")
   
   //Condicional
   se precisaoTime1 > precisaoTime2 entao
      escreval("O Flamengo foi mais preciso que o Vasco, sendo ", (precisaoTime1 - precisaoTime2):3:2 ,"% mais preciso!")
   senao
      escreval("O Vasco foi mais preciso que o Flamengo, sendo ", (precisaoTime2 - precisaoTime1):3:2 ,"% mais preciso!")
   fimse
   
Fimalgoritmo