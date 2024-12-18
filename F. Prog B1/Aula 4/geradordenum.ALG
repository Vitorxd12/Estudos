Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Descrição   : Aqui você descreve o que o programa faz! (função)
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


   escreval("Houveram", contagem, " números acima de 50")
   escreval("Isso é ", porcento:2:2, "% dos numeros")


Fimalgoritmo