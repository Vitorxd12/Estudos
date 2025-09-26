Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/11/2024
Var
   salario : real


Inicio
   escreval("Quanto que você ta ganhando aqui na nossa empresa?")
   leia(salario)

   se salario > 3000 entao
      salario := salario + ((20/100)* salario )
      escreval("Você receberá 20% de aumento e passará a receber", salario)
   senao
      salario := salario + ((10/100)* salario )
      escreval("Você receberá 10% de aumento e passará a receber", salario)
   fimse

Fimalgoritmo