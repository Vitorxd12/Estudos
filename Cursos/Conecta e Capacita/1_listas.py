# cria vetor
frutas = ["banana", "maca"]
#printa vetor no indicie
print(frutas[1])
# adiciona item no indice
frutas[1] = "abacaxi"
print(frutas)

#adiciona
frutas.append("pera")
print(frutas)

#adicona varios
frutas.extend(["kiwi", "morango"])
print(frutas)

#adiciona no meio, negativo conta de tras pra frente (nesse caso no penultimo)
frutas.insert(-1, "uva")
print(frutas)

#remove
frutas.remove("pera")
print(frutas)

#remove o ultimo
frutas.pop()

#remove no indice
frutas.pop(2)
print(frutas)

numeros = [0, 1, 2, 3, 4, 5, 6]
print(numeros)

#fatiamento de lista
print(numeros[2:5])
print(numeros[:5])
print(numeros[5:])
print(numeros[::2])
print(numeros[::-1])

#funcoes uteis
print(len(numeros))
print(min(numeros))
print(max(numeros))
print(sum(numeros))

numeros.sort()
print(numeros)
numeros.sort(reverse=True)
print(numeros)

for i in numeros:
    print(f"numero da lista {i}")
    
for i, fruta in enumerate(frutas):
    print(f"fruta {i} é {fruta}")
    
    
    
## valores inseridos pelo usuario
valores = []
for i in range(5):
    valores.append(int(input("Digite um valor\n")))
print(valores)
print(max(valores))
print(min(valores))
print(sum(valores))

## Calculo da média com base em gabarito

gabarito = ['c', 'a', 'b', 'c', 'e', 'd', 'd', 'a', 'c', 'b']
quantidadeDeAcertos = 0
for i in range(len(gabarito)):
    resposta = input(f"Digite a resposta da questão {i + 1}\n")
    if resposta == gabarito[i]:
        quantidadeDeAcertos += 1
        print("Acertou")
    else:
        print("Errou")
print(f"Você acertou {quantidadeDeAcertos} questões")