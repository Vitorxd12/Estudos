Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 25/11/2024

//Comando de repeti��o, PARA, ENQUANTO e REPITA (esse ultimo n�o muita usada, pode usar o enquanto)
//Tem que ter fim, se n�o pode dar erro.

//O loop ir� parar:
//Por um n�mero determinado de vezes;
//At� que um evento ocorra
//Solicita��o do usu�rio

//Nessa aula veremos PARA
//O para � ideal para um numero especifico de vezes, ou contar

//a estrutura depender de uma "Variavel de apoio" ou "variavel de controle"
//essa vari�vel tem q ser um numero inteiro
//toda vez q o loop do para for completo, a variavel aumentar� em um
//para (variavel) de (valor inicial) at� (valor final) passo (o tanto q vai subir por vez) faca
//n�o modifique a variavel de apoio.
Var
   contador, quantidade, alcance : inteiro

Inicio
escreval("Voc� quer gerar quantos n�meros aleat�rios?")
leia(quantidade)
escreval("Qual o valor maximo a ser gerado?")
leia(alcance)

   para contador de 1 ate quantidade passo 1 faca
      escreval(randi(alcance)+1)
   fimpara


Fimalgoritmo