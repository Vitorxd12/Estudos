
#1. Contar palavras Leia uma frase do usuário e mostre quantas palavras ela tem (use split()).
frase = str(input("Digite uma frase \n"))
palavras = frase.split()
print(f"A frase tem {len(palavras)} palavras.")

#2. Listar palavras numeradas Peça uma frase e imprima cada palavra numerada a partir de 1 (use enumerate(..., start=1)).
for i, palavra in enumerate(palavras, start=1):
    print(f"Palavra {i}: {palavra}")
    
#3. Primeira letra de cada palavra: Dada uma frase, exiba a posição (1-based) e a primeira letra de cada palavra.
for i, palavra in enumerate(palavras, start=1):
    print(f"Palavra {i}: {palavra} | Primeira letra é {palavra[0]}")
    
#4. Filtrar palavras curtas Dada uma frase, mostre as palavras com tamanho ≥ 4, numeradas.
for i, palavra in enumerate(palavras, start=1):
    if len(palavra) >= 4:
        print(f"Palavra {i}: {palavra}")
        
#5. Quebra por vírgulaReceba uma string no formato "maçã,banana,pera" e imprima os itens com índice (0-based) e valor.
frutas = "maca,banana,pera"
listaDeFrutas = frutas.split(",")
for i in range(len(listaDeFrutas)):
    print(f"Item {i} da lista é {listaDeFrutas[i]}")
    
#6. CSV simples para tabela: Dada a string "nome;idade;cidade\nAna;23;Recife\nJoão;31;Maceió", separe linhas com split('\n'), depois colunas com split(';') e mostre cada célula numerada por linha/coluna.
tabelaCSV = "nome;idade;cidade\nAna;23;Recife\nJoão;31;Maceió"
for i, linha in enumerate(tabelaCSV.split("\n")):
    colunas = linha.split(";")
    for j, coluna in enumerate(colunas):
        print(f"Linha {i} Coluna {j}: {coluna}")
        
#7. Remover palavras vazias: Dada uma frase com múltiplos espaços, separe as palavras ignorando vazios e mostre-as numeradas (dica: split() sem argumento já trata múltiplos espaços).
fraseComEspacos = "  Olá   tudo bem    com você   "
palavrasSemVazios = fraseComEspacos.split()
print(palavrasSemVazios)

#8. Contar ocorrências de uma palavra : Dada uma frase e uma palavra-alvo, conte em qual(es) índice(s) (0-based) ela aparece (comparação case-insensitive).
frase = str(input("Digite uma frase \n"))
palavraAlvo = str(input("Digite a palavra que deseja encontrar \n"))
palavras = frase.split()
for i in range(len(palavras)):
    if palavras[i].lower() == palavraAlvo.lower():
        print(f"A palavra {palavraAlvo} foi encontrada no índice {i}")

#9. Extrair domínios de e-mails Receba uma string com e-mails separados por espaço. Para cada e-mail, pegue o que vem depois de '@' e exiba numerado.
emails = "vitorxd12.12@gmail.com vitor.dias@marata.com.br vitor.dias038@academico.ifs.edu.br"
listaDeEmails = emails.split()
for i in range(len(listaDeEmails)):
    dominio = listaDeEmails[i].split("@")[1]
    print(f"Email {i}: {listaDeEmails[i]} | Domínio: {dominio}")
    
#10. Quebrar caminho de arquivo Dada "C:/Users/Alfredo/Documents/aula.txt", separe pelos '/' e liste cada segmento com seu índice.
caminho = "C:/Users/Alfredo/Documents/aula.txt"
partesDoCaminho = caminho.split("/")
for i in range(len(partesDoCaminho)):
    print(f"Parte {i}: {partesDoCaminho[i]}")

#11. Inverter pares (índice, palavra) Dada uma frase, crie uma lista de tuplas (palavra, índice) e mostre o resultado.
frase = "um dois tres quatro cinco"
palavras = frase.split()
for i in range(len(palavras)):
    print(f"Palavra {i}: {palavras[i]}")
listaDeTuplas = []
for i in range(len(palavras)):
    listaDeTuplas.append((palavras[i], i))
print(listaDeTuplas)
#12. Marcar palavras repetidas Dada uma frase, percorra as palavras e, se uma palavra já tiver aparecido antes (case-insensitive), acrescente "(repetida)" ao mostrar.
frase = "banana banana banana terracota pie"
palavras = frase.split()
for i in range(len(palavras)):
    for j in range(len(palavras)):
        if palavras[i].lower() == palavras[j].lower() and i != j:
            print(f"Palavra {i}: {palavras[i]} (repetida)")
            break
    else:
        print(f"Palavra {i}: {palavras[i]}")
    

#13. Resumo de linhas Receba várias linhas de texto numa única string (separadas por \n). Para cada linha, mostre linha N: X palavras (use split('\n') + split() por linha + enumerate).

