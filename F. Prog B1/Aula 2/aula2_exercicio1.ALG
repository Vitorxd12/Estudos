Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/11/2024
Var
   vel, lim, mul : real


Inicio
   vel := randi(160) + 1
   lim := 80

   se vel > lim entao
      mul := (vel - lim )* 10
      escreval("Você estava a", vel, "km/h e por isso foi multado!")
      escreval("Sua multa será de", mul)
   senao
      escreval("Você estava a", vel, "km/h e por isso não será multado")
   fimse


Fimalgoritmo