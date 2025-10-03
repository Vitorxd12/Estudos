pessoas = [
    {"nome" : "Harry", "casa": "Gryffindor"},
    {"nome" : "Cho", "casa": "Ravenclow"},
    {"nome" : "Draco", "casa": "Slytherin"},
]
##hashmap dentro de listas
##não da pra usar um .sort() por que ele não sabe como comparar hashmaps

##uma forma em que eu posso fazer isso é definindo uma função que recebe item da lista de mapas e retorna o valor do mapa que foi indicado
def buscarNomePessoaEmMap(pessoa):
    return pessoa["nome"]

##dai eu passo a função como um lambda que sera usado em cada uma das instacias da lista, permitindo comparação
pessoas.sort(key=buscarNomePessoaEmMap)

##mas se eu quiser fazer isso sem precisar fazer a função inteira denovo? eu uso funcões lambda

pessoas.sort(key=lambda pessoa: pessoa["casa"])
##tradução:
# organize a lista de pessoas, mas em cada instancia que voce analisar, use a seguinte chave
# crie uma função chamada lambda que vai aceitar como input um item da lista de hashmaps e o chame de pessoa
# retorne o parametro casa do hash pessoa
# isso é a mesma coisa que fizemos antes com a funcao busvarNomePessoaEmMap, mas tudo em uma linha só

print(pessoas)