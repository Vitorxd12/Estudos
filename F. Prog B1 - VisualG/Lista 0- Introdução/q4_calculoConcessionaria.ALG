Algoritmo "L0q4"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira 
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 11/11/2024


//O custo à concessionária (CC) de um carro novo é o custo de fábrica
//(CF) adicionado 40% de impostos sobre o valor do custo de fábrica (CF).
//Supondo que o percentual de lucro da concessionária é de 30% sobre
//o custo que a mesma recebe, crie um algoritmo que leia o custo de
//fábrica e calcule e informe o preço de venda ao consumidor (PVC).
//Exemplo: CF: R$ 50.0000 CC: 70.000 PVC: 91.000


Var
custoConce, custoFabri, impostos, precoVenda, lucro : real


Inicio
//Entrada de dados
escreval("Quanto que está o preço deste carro na fabrica?")
leia(custoFabri)

//Definição de valores em porcentagem
impostos := 40 / 100
lucro := 30 / 100

//Soma do preço com o valor resultante da porcentagem.
custoConce := custoFabri + (custoFabri * impostos)
precoVenda := custoConce + (custoConce * lucro)

escreval("O custo do carro na fabrica é de ", custoFabri, ". Na concessionaria, é ", custoConce, ". Para o cliente, fica de ",  precoVenda)

Fimalgoritmo