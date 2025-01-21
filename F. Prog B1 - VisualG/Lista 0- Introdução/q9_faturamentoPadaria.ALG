Algoritmo "L0q9"
// Disciplina   : [Fundamentos da progamação]
// Professor   : Telmo Oliveira 
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 12/11/2024

//09 - Elabore um algoritmo para ler a quantidade vendida de pães
//e broas de uma padaria. A seguir, informe o total de vendas da padaria sabendo
//que cada pão custa R$ 0,50 e cada broa R$ 0,30. Sabendo que o proprietário
//armazena em uma conta poupança 15% do faturamento de cada dia, informe
//também o valor que será poupado neste dia.

Var
nmPao, nmBroa, vlPao, vlBroa, faturamento, poupanca : real


Inicio
escreval("Quantos pães a padaria vendeu hoje?")
leia(nmPao)

escreval("Quantas broas?")
leia(nmBroa)

vlPao := nmPao * 0.5
vlBroa := vlBroa * 0.3
faturamento := vlPao + vlBroa
poupanca := (15/100) * faturamento

escreval("Hoje a padaria faturou", faturamento, ". Hoje, será poupado", poupanca)


Fimalgoritmo