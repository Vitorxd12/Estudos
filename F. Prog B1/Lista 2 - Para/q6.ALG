Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 03/12/2024

//6 - Em uma eleição presidencial existem quatro candidatos. Os votos são
//informados por meio de código (1, 2, 3, 4, 5 (nulo) e 6 (branco).
//Elabore um programa que calcule e mostre: o total de votos para cada candidato,
// o percentual de votos de cada candidato, de votos nulos e de votos em branco.
Var
   vt, c, vtCan1, vtCan2, vtCan3, vtCan4, vtNulo, vtBranco : inteiro
   pcCan1, pcCan2, pcCan3, pcCan4, pcCan5, pcCan6 : real


Inicio

   rep := 0
   para c de 1 ate rep faca
      escreval()
      escreval("para quem é seu voto? (1, 2, 3, 4, 5(Nulo), 6(Branco))")
      vt := randi(6) + 1

      escolha(vt)
      caso 1
         escreval("Voto confirmado para o candidato 1")
         vtCan1 := vtCan1 + 1
      caso 2
         escreval("Voto confirmado para o candidato 2")
         vtCan2 := vtCan2 + 1
      caso 3
         escreval("Voto confirmado para o candidato 3")
         vtCan3 := vtCan3 + 1
      caso 4
         escreval("Voto confirmado para o candidato 4")
         vtCan4 := vtCan4 + 1
      caso 5
         escreval("Voto nulo")
         vtNulo := vtNulo + 1
      fimescolha
      se (vt >= 6) ou (vt <= 0) entao
         escreval("Voto em branco")
         vtBranco := vtBranco + 1
      fimse
   fimpara
   escreval("Votos por candidato:")


Fimalgoritmo