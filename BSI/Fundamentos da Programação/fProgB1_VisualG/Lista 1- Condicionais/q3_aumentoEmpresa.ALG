Algoritmo "q3L1"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 21/11/2024

//03 - Uma empresa concederá um aumento de salário aos seus funcionários,
//variável de acordo com o cargo e tempo de empresa.
//Faça um programa que leia o salário base, o cargo e o tempo de empresa de
//um funcionário e calcule o novo salário.

//CARGO / TEMPO DE EMPRESA / AUMENTO
//ANALISTA--MAIS DE 5 ANOS----40%
//ANALISTA--ATÉ 5 ANOS--------30%
//GERENTE---MAIS DE 5 ANOS----20%
//GERENTE---ATÉ 5 ANOS--------10%

Var
   salario, novoSalario : real
   cargo, aumento : caractere
   tempoEmpresa : inteiro
Inicio

   //Coleta de dados de forma simpática
   escreval("Quantos anos tem que você ta na empresa?")
   leia(tempoEmpresa)

   escreval("Ah, legal. E qual é o seu cargo aqui mesmo?")
   escreval("Digite a para analista ou g para gerente (minusculo)")
   leia(cargo)

   escreval("E seu salario atual, quanto é? preciso saber para calcular o aumento")
   leia(salario)

   //Processamento para analistas
   se ((cargo = "a") e (tempoEmpresa > 5)) entao
      novoSalario := salario * 1.4
      aumento := "40%"
   fimse
   se ((cargo = "a") e (tempoEmpresa <= 5)) entao
      novoSalario := salario * 1.3
      aumento := "30%"
   fimse

   //Processamento para gerentes
   se ((cargo = "g") e (tempoEmpresa > 5)) entao
      novoSalario := salario * 1.2
      aumento := "20%"
   fimse
   se ((cargo = "g") e (tempoEmpresa <= 5)) entao
      novoSalario := salario * 1.1
      aumento := "10%"
   fimse

   escreval("Parabés! Graças aos seus", tempoEmpresa, " anos na empresa em seu cargo de ", cargo, " você receberá um aumento de ", aumento, " no seu salario de", salario, " que passará a valer", novoSalario)

Fimalgoritmo