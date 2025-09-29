
# Estruturas condicionais simples
idade = int(input("Digite sua idade\n"))
if idade >= 18:
    print("vc é maior de idade")
else:
    print("vc é menor de idade")

# Estruturas condicionais encadeadas
media = float(input("Digite sua média\n"))
if media >= 7:
    print("Aprovado")
elif media >= 5:
    print("Recuperação")
else:
    print("Reprovado")
    
# for
tabuada = int(input("Digite a tabuada que deseja\n"))
for j in range(1, 11):
    print(j * tabuada)
    
# while
valorASomar = 1
soma = 0
while valorASomar != 0:
    valorASomar = int(input("Digite um valor para somar\n"))
    soma = soma + valorASomar
print(f"A soma dos valores é {soma}")


fatorial = int(input("Digite um valor para calcular o fatorial\n"))
resultado = 0;

for i in range(1, fatorial + 1):
    resultado *= i
print(f"O fatorial de {fatorial} é {resultado}")

#triangulo
a = int(input("Digite o valor do lado A\n"))
b = int(input("Digite o valor do lado B\n"))
c = int(input("Digite o valor do lado C\n"))

if a < b + c and b < a + c and c < a + b:
    if a == b and b == c:
        print("Triângulo Equilátero")
    elif a == b or b == c or a == c:
        print("Triângulo Isósceles")
    else:
        print("Triângulo Escaleno")
else:
    print("Não é um triângulo")
    