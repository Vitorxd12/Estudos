Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 09/12/2024

//03 - Elabore um programa para controlar os vinhos de um apreciador desta bebida.
//O programa deverá ler o tipo do vinho (B-Branco, R-Rose, T-Tinto),
//nacionalidade (3 caracteres) e o ano da safra. O programa deverá ser
//encerrado com o ano 9999. A seguir, informe:

//- Total de vinhos brasileiros (BRA); - Total de vinhos brancos;
//- Total de vinhos tintos; - Total de vinhos antes de 2015;
Var
   tipVin, nacVin : caractere
   safVin, vinB, vinT, safPre2015, vinBRA : inteiro

Inicio
   escreval("Qual o ano da safra do vinho?")
   leia(safVin)

   enquanto safVin <> 9999 faca
      escreval("Qual a nacionalidade do vinho? (3 Caracteres)")
      leia(nacVin)
      escreval("Qual o tipo do vinho? (B- Branco, R- Rose, T- Tinto)")
      leia(tipVin)
      
      //Tipo de vinho
      se maiusc(tipVin) = "B" entao
         vinB := vinB + 1
      senao
         se maiusc(tipVin) = "T" entao
            vinT := vinT + 1
         fimse
      fimse
      //Vinhos pré 2015
      se safVin < 2015 entao
         safPre2015 :=  safPre2015 + 1
      fimse
      //Vinhos brasileiros
      se maiusc(nacVin) = "BRA" entao
         vinBRA := vinBRA + 1
      fimse

      escreval("Vinho cadastrado!")
      escreval("Para parar de cadastrar vinhos, digite 9999 como ano da safra.")
      escreval("Qual o ano da safra do vinho?")
      leia(safVin)
   fimenquanto
   
escreval("Total de vinhos brasileiros (BRA): ", vinBRA)
escreval("Total de vinhos brancos: ", vinB)
escreval("Total de vinhos tintos: ", vinT)
escreval("Total de vinhos antes de 2015: ", safPre2015)
Fimalgoritmo