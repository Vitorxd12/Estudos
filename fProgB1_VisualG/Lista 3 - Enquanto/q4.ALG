Algoritmo "semnome"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 10/12/2024

//04 - Elabore um programa para controlar os pedidos de uma pizzaria.
//O programa dever� solicitar o tamanho da pizza (P, M, G, F), sabor da pizza
//(MUS, PRE, CAL, POR, MIL, FRA) e o valor da pizza.
//O programa dever� ser finalizado com o tamanho �Z�. A seguir, informe:

//- Faturamento da pizzaria. Para as pizzas de sabores �MUS� e �PRE�,
//considere um desconto de 20%;

//- Informe a quantidade de refrigerantes de
//brindes (para pizzas do tamanho �F�);

//- Informe o total de vendas de pizzas tamanhos �P� e �M� (juntas);

Var
   tamPiz, sabPiz : caractere
   valPiz, fatura : real
   refBrin,vendPizPeM : inteiro


Inicio
   escreval("Bem vindos � Pizzaria do Tinho!")
   escreval("Qual tamanho da pizza que foi pedida? (P, M, G, F)")
   leia(tamPiz)

   enquanto maiusc(tamPiz) <> "Z" faca

      tamPiz := maiusc(tamPiz)
      escreval("Qual o sabor pedido pelo cliente?")
      escreval("Digite uma das op��es: (MUS, PRE, CAL, POR, MIL, FRA).")
      leia(sabPiz)
      sabPiz := maiusc(sabPiz)
      escreval("Quanto esta pizza est� custando?")
      leia(valPiz)
      ///

      se ((sabPiz = "MUS") ou (sabPiz = "PRE")) entao
         valPiz := valPiz - (valPiz * 0.2)
      fimse
      fatura := fatura + valPiz

      se tamPiz = "F" entao
         refBrin := refBrin + 1
      senao
         se ((tamPiz = "M") ou (tamPiz = "P")) entao
            vendPizPeM :=  vendPizPeM + 1
         fimse
      fimse

      ///
      escreval("Outra pizza? Se sim, digite o tamanho: (P, M, G, F).")
      escreval("Se n�o, digite 'Z'.")
      leia(tamPiz)
   fimenquanto
   escreval("Hoje faturamos, em reais: ",fatura)
   escreval("Destribuimos esta quantidade de refris de brinde: ",refbrin)
   escreval("Vendemos esta quantidade de pizzas medias ou pequenas: ",vendPizPeM)

Fimalgoritmo