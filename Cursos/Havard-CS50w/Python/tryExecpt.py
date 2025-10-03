import sys

x = 5
y = 0

##Uepa nenem
# não da pra dividir 5/0
# vai dar erro
# então a gente tenta, se não der, paciencia

#tente fazer a divisão
try:
    result = x / 0
except ZeroDivisionError: #se der um erro de divisão, print o erro e quite com um uma saida 0
    print("Erro")
    sys.exit(1)

