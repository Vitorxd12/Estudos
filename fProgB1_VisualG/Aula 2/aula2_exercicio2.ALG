Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/11/2024
Var
   salario : real


Inicio
   escreval("Quanto que voc� ta ganhando aqui na nossa empresa?")
   leia(salario)

   se salario > 3000 entao
      salario := salario + ((20/100)* salario )
      escreval("Voc� receber� 20% de aumento e passar� a receber", salario)
   senao
      salario := salario + ((10/100)* salario )
      escreval("Voc� receber� 10% de aumento e passar� a receber", salario)
   fimse

Fimalgoritmo