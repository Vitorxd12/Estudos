Algoritmo "aula2_exemplo2"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/11/2024
Var
   vlPorHora, horasTrabalhadas, salBru, salLiq, imposto, vlDesconto: real


Inicio
   vlPorHora := randi(30) //randi(31) gera um numero, de 0 a 30, aleatoriamente
   escreval("Este trabalhador ganha, em reais por hora, ",vlPorhora)

   horasTrabalhadas := randi(50) + 1  //randi(50) + 1 gera um numero de 1 a 50
   escreval("Este trabalhador trabalhou, em horas, ", horasTrabalhadas)

   imposto := 7

   salBru :=  horasTrabalhadas * vlPorHora
   salLiq := salBru - ((imposto/100) * salBru)

   escreval(salLiq:9:2)
Fimalgoritmo