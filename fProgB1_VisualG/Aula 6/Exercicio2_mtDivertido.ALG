Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 23/01/2025]

//03 - Supondo que a popula��o de uma cidade A seja da ordem de 100.000
//habitantes com uma taxa anual de crescimento de 4% e que a popula��o
//de uma cidade B seja 120.000 habitantes com uma taxa de crescimento de 1%.

//Elabore um programa que calcule e escreva o n�mero de anos necess�rios
//para que a popula��o da cidade A ultrapasse ou iguale a popula��o da
//cidade B, mantidas as taxas de crescimento.

//N�mero de anos: 8
Var
   vCityA, vCityB : vetor[1..20] de inteiro
   c : inteiro


Inicio
   c:=1
   vCityA[1] := 100000
   vCityB[1] := 120000
   enquanto (vCityA[c] < vCityB[c]) faca
      vCityA[c+1] := vCityA[c] + (vCityA[c] \100 * 4)
      vCityB[c+1] := vCityB[c] + (vCityB[c] \100)
      c := c + 1
   fimenquanto
   escreva(c, " Anos")

Fimalgoritmo