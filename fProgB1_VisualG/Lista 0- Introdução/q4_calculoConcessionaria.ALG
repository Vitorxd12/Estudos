Algoritmo "L0q4"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira 
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 11/11/2024


//O custo � concession�ria (CC) de um carro novo � o custo de f�brica
//(CF) adicionado 40% de impostos sobre o valor do custo de f�brica (CF).
//Supondo que o percentual de lucro da concession�ria � de 30% sobre
//o custo que a mesma recebe, crie um algoritmo que leia o custo de
//f�brica e calcule e informe o pre�o de venda ao consumidor (PVC).
//Exemplo: CF: R$ 50.0000 CC: 70.000 PVC: 91.000


Var
custoConce, custoFabri, impostos, precoVenda, lucro : real


Inicio
//Entrada de dados
escreval("Quanto que est� o pre�o deste carro na fabrica?")
leia(custoFabri)

//Defini��o de valores em porcentagem
impostos := 40 / 100
lucro := 30 / 100

//Soma do pre�o com o valor resultante da porcentagem.
custoConce := custoFabri + (custoFabri * impostos)
precoVenda := custoConce + (custoConce * lucro)

escreval("O custo do carro na fabrica � de ", custoFabri, ". Na concessionaria, � ", custoConce, ". Para o cliente, fica de ",  precoVenda)

Fimalgoritmo