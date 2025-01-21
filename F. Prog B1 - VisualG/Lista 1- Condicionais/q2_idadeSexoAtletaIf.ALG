Algoritmo "L1q2"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 21/11/2024

//02 - A confederação brasileira de natação promoverá eliminatórias para o
//próximo mundial. Elabore um programa que receba a idade e o sexo de um
//nadador e determine a sua categoria segundo a tabela a seguir:

//SEXO IDADE CATEGORIA
//F 5-10 F-INFANTIL
//F 11-17 F-JUVENIL
//F >=18 F-ADULTO
//M 5-10 M-INFANTIL
//M 11-17 M-JUVENIL
//M >=18 M-ADULTO
Var
   sexo : caractere
   idade : inteiro



Inicio
   escreval("Qual a idade do atleta?")
   leia(idade)
   
   //Jovem demais
   se idade < 5 entao
      escreval("O atleta é jovem demais para participar!")
   senao
      escreval("Qual o sexo do atleta? (Digite m para masculino e f para feminino)")
      leia(sexo)
   fimse

   //Feminino
   se ((idade >= 5) e (idade <= 10) e (sexo = "f")) entao
      escreval("A atleta participará da categoria F-INFANTIL")
   fimse
   se ((idade >= 11) e (idade <= 17) e (sexo = "f")) entao
      escreval("A atleta participará da categoria F-JUVENIL")
   fimse
   se ((idade >= 18) e (sexo = "f")) entao
      escreval("A atleta participará da categoria F-ADULTO")
   fimse

   //Masculino
   se ((idade >= 5) e (idade <= 10) e (sexo = "m")) entao
      escreval("O atleta participará da categoria M-INFANTIL")
   fimse
   se ((idade >= 11) e (idade <= 17) e (sexo = "m")) entao
      escreval("O atleta participará da categoria M-JUVENIL")
   fimse
   se ((idade >= 18) e (sexo = "m")) entao
      escreval("O atleta participará da categoria M-ADULTO")
   fimse

Fimalgoritmo