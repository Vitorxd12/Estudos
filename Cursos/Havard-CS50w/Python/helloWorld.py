helloWorld = 'Hello World'
print(helloWorld)

##Variaveis
#Em python, não é necessario pre indicar qual é o tipo da variavel, é so usar
a = 28
b = 1.5
c = "Hello World"
d = True
e = None

##Sequencias
print(f'Sequencias em Python: {helloWorld}')
print(helloWorld[0]) #Imprime o primeiro caractere da string
print(helloWorld[3]) #Imprime o quarto caractere da string
print(helloWorld[-1]) #Imprime o ultimo caractere da string
print(helloWorld[0:5]) #Imprime do indice 0 ao 4
print(helloWorld[:5]) #Imprime do inicio ao indice 4
print(helloWorld[6:]) #Imprime do indice 6 ao final
print(helloWorld[::2]) #Imprime do inicio ao final, pulando de 2 em 2
print(helloWorld[::-1]) #Imprime do final ao inicio

##Listas
print('\nListas em Python:')
nomes = ["Ana", "Bia", "Carlos"]
print(nomes[0])
nomes.append('Diana')
nomes.sort()
print(nomes)
print(len(nomes))

##Tuplas
#guardo dois valores em uma so variavel, não pode ser mudada
print('\nTuplas em Python:')
coordenada = (10.0, 20.0)
print(coordenada)

##Sets
#não aceita valores repetidos
print('\nSets em Python:')
set = set()
set.add(1)
set.add(2)
set.add(2) #não vai adicionar
set.add(3)
set.add(4)
set.add(5)
print(set)
set.remove(4)

##loops
print('\nLoops em Python:')
for i in set:
    print(i)
print('Tabuada do 2:')
for i in range(10):
    print((1+i) * 2)

##Dicionarios
#dict é um dicionario, onde temos chave e valor. a gente busca com um valor (chave) e retorna outro valor (valor). hashmap em outras linguagens
print('\nDicionarios em Python:')
#harry -> Gryffindor draco -> Slytherin
casa = {"Harry": "Gryffindor", "Draco": "Slytherin"}
print(casa["Harry"])
casa["Hermione"] = "Gryffindor" #adiciona uma chave e valor
print(casa)

##Funções
print('\nFunções em Python:')
##Minha funcao esta em outro aquivo, entao é peciso importar. geralmente é feito la em cima, mas vou fazer aqui so por leitua
from funcoes import quadrado
for i in range(10):
    print(f'O quadrado de {i} é {quadrado(i)}')

##outra forma de fazer isso é so importando o modulo inteiro e referenciando depois na hora de chamar o funcao
import funcoes
for i in range(10):
    print(f'O cubo de {i} é {funcoes.cubo(i)}')
##importando bibliotecas é possivel extender a linguagem python



print('\nInput e condicionais em Python:')
#Input
nome = input("Digite seu nome: ")
print("Olá, " + nome) #O + concatena strings

#Fstrings permite que a gente insira variaveis dentro de strings, melhor que concatenando strings
print(f'Olá, {nome}.')

#Condicionais
idade = int(input("Digite sua idade: ")) #input retorna string, por isso convertemos para int

if idade < 0:
    print("Você ainda não nasceu.")
elif idade < 18:
    print("Você é menor de idade.")
else:
    print("Você é maior de idade")
