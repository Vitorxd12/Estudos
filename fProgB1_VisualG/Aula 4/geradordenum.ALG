Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/11/2024
Var
   c, idade, contagem, repeticoes : inteiro
   porcento : real

Inicio
   contagem := 0
   idade := 0
   repeticoes := 3000

   para c de 1 ate repeticoes faca
      idade := randi(100)
      escreval(idade)
      se idade > 50 entao
         contagem := contagem + 1
         escreval("Contagem + 1")
      fimse
   fimpara
   porcento := (contagem/repeticoes) * 100


   escreval("Houveram", contagem, " n�meros acima de 50")
   escreval("Isso � ", porcento:2:2, "% dos numeros")


Fimalgoritmo