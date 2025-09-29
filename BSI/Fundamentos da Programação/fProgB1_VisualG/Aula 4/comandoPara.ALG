Algoritmo "semnome"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 25/11/2024

//Comando de repetição, PARA, ENQUANTO e REPITA (esse ultimo não muita usada, pode usar o enquanto)
//Tem que ter fim, se não pode dar erro.

//O loop irá parar:
//Por um número determinado de vezes;
//Até que um evento ocorra
//Solicitação do usuário

//Nessa aula veremos PARA
//O para é ideal para um numero especifico de vezes, ou contar

//a estrutura depender de uma "Variavel de apoio" ou "variavel de controle"
//essa variável tem q ser um numero inteiro
//toda vez q o loop do para for completo, a variavel aumentará em um
//para (variavel) de (valor inicial) até (valor final) passo (o tanto q vai subir por vez) faca
//não modifique a variavel de apoio.
Var
   contador, quantidade, alcance : inteiro

Inicio
escreval("Você quer gerar quantos números aleatórios?")
leia(quantidade)
escreval("Qual o valor maximo a ser gerado?")
leia(alcance)

   para contador de 1 ate quantidade passo 1 faca
      escreval(randi(alcance)+1)
   fimpara


Fimalgoritmo