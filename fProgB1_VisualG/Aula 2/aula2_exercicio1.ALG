Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/11/2024
Var
   vel, lim, mul : real


Inicio
   vel := randi(160) + 1
   lim := 80

   se vel > lim entao
      mul := (vel - lim )* 10
      escreval("Voc� estava a", vel, "km/h e por isso foi multado!")
      escreval("Sua multa ser� de", mul)
   senao
      escreval("Voc� estava a", vel, "km/h e por isso n�o ser� multado")
   fimse


Fimalgoritmo