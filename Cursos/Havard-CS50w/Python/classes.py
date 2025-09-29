class Ponto():
    ## Constructor  - sempre chama como init
    ##Nao precisa defini atributos, eles nascem automaticamnete com o self
    def __init__(self, x , y):
        self.x = x
        self.y = y

ponto = Ponto(2,3)
print(ponto.x)
print(ponto.y)

class Voo():
    def __init__(self, capacidade):
        self.capacidade = capacidade
        self.passageiros = []

    def adicionar_passageiro(self, nome):
        if self.assentos_disponiveis() == 0:
            return False
        else:
            self.passageiros.append(nome)
            return True
    def assentos_disponiveis(self):
        return self.capacidade - len(self.passageiros)

voo = Voo(3)

pessoas = ['Harry', 'Ron', 'Hermione', 'Draco']
for pessoa in pessoas:
    if voo.adicionar_passageiro(pessoa):
        print(f'Adicionado {pessoa} com sucesso.')
    else:
        print(f'Não foi possível adicionar {pessoa}. Voo lotado.')

