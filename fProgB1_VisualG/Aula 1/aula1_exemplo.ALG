Algoritmo "PriExemplo"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira 
// Descri��o   : Calculo de s�lario liquido ap�s desconto do INSS
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 11/11/2024

                    //Resumo aula passada

//Aula passada, vimos os comandos:
//Atribui��o e definic��o de variaveis(:=);
//Entrada(leia);
//Sa�da(escreva);

//Use-os.


Var
vlPorHora, horasTrabalhadas, salBru, salLiq, imposto, vlDesconto: real


Inicio
escreval("Quantos reais o colaborador recebe por hora?")
leia(vlPorHora)

escreval("Quantas horas esse colaborador trabalhou este m�s?")
leia(horasTrabalhadas)

escreval("Quanto do salario, em por cento, ser� descontado pelo INSS?")
leia(imposto)

salBru :=  horasTrabalhadas * vlPorHora
salLiq := salBru - ((imposto/100) * salBru)

escreval(salLiq:9:2)//Este :9:2 funciona assim: o primeiro numero ap�s os
//dois pontos indica a quantidade de casas. o segundo numero, ap�s o segundo
//dois pontos, indica a quantidade de numeros decimais ap�s a virgula.


Fimalgoritmo