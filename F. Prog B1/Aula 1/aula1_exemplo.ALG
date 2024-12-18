Algoritmo "PriExemplo"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira 
// Descrição   : Calculo de sálario liquido após desconto do INSS
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 11/11/2024

                    //Resumo aula passada

//Aula passada, vimos os comandos:
//Atribuição e definicção de variaveis(:=);
//Entrada(leia);
//Saída(escreva);

//Use-os.


Var
vlPorHora, horasTrabalhadas, salBru, salLiq, imposto, vlDesconto: real


Inicio
escreval("Quantos reais o colaborador recebe por hora?")
leia(vlPorHora)

escreval("Quantas horas esse colaborador trabalhou este mês?")
leia(horasTrabalhadas)

escreval("Quanto do salario, em por cento, será descontado pelo INSS?")
leia(imposto)

salBru :=  horasTrabalhadas * vlPorHora
salLiq := salBru - ((imposto/100) * salBru)

escreval(salLiq:9:2)//Este :9:2 funciona assim: o primeiro numero após os
//dois pontos indica a quantidade de casas. o segundo numero, após o segundo
//dois pontos, indica a quantidade de numeros decimais após a virgula.


Fimalgoritmo