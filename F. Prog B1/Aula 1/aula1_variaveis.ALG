Algoritmo "Aula1"
// Disciplina   : [Fundamentos da progama��o]
// Professor   : Telmo Oliveira
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Vitor Oliveira Costa Dias
// Data atual  : 07/11/2024

                           //VARI�VEIS
//Na aula de hoje, teremos uma introdu��o � base de progama��o.
//A principal fun��o de um computador � PROCESSAR DADOS.
//E para processar dados, precisamos salvar-los e administrar-los
//Para salvar dados para nossos processamentos, ultilizamos  VARI�VEIS
//N�O CONFUNDIR DADOS COM LISTAS. Dado � o pre�o do produto, n�o a nota fiscal.
//Vari�veis = aloca��o de mem�ria
//Geralmente, quanto menos var�veis, mais leve. Cuidado para n�o usar demais.
//Em pequenas progamas tudo bem, mas em grandes sistemas, evite ter muitas.


                          //NOMES DE VARI�VIES
//Quando for por os nomes das v�riaveis, seja claro e padronize.
//variaveis de nome
//nome_alu
//n_prof
//nm_coor
//s�o todos nomes de variaveis de nome, mas n�o seguem um padr�o claro.

//nm_alu
//nm_prof
//nm_coor
//este s�o nomes de variaveis padronizados.
//a pessoa deve ser capaz de saber do que se trata a variavel apenas lendo.
//sem codigos doidos ou letras singulares.
//Uma empresa s�ria geralmente entrega um documento que explique todas as vari�veis

//Algumas palavras como in�cio s�o proibidas. Espa�os e simbolos tamb�m.


                             //TIPOS DE VARI�VEIS
                             
//Real: N�MEROS COM V�RGULA. Pre�o, Altura, Taxas.
//Inteiro: N�meros inteiros: Idade, Estoque, Alunos na turma, Matricula.
//Caracter ou String: Texto: Nome do paciente, Modelo do carro
//L�gico ou Boleano: Ou sim ou n�o, verdadeiro ou falso. ON ou OFF.
//Constante: Vari�vel que n�o muda o valor.

//byte, long, double, ou outros tipos de varaiveis, s�o varia��es de int ou float
//Estas varia��es existem para economizar mem�ria
//Char, por exemplo, � uma varia��o de string que s� cabe uma letra apenas.


                           //DECLARA��ES DE CONSTANTES
//Const
//Quando for declarar uma variavel constatane, � necess�rio fazer isso separado
//da sec��o anterior. neste caso, � necess�rio fazer aqui, nesta esc��o.
//a vantagem de uma constante em um c�digo � evitar a repeti��o de caracteres iguais
//por exemplo. imgagine q o gerente vai ganhar um valor x de desconto.
//caso o dono queira mudar o desconto do gerente, ao editar esse valor, todas
//desconto_gerente := 20
//as instancias deste desconto vai mudar ao mesmo tempo
//isto evita que mudamos este valor 1000 vezes ao decorrer do codigo.

//pi_const := 3.14


Var
                       //DECLARA��O DE VARIAVEIS
//Pare usar uma vari�vel, vc tem que declarar-las aqui.
//Voc� vai separar as variaveis por vigua, dois pontos e o tipo de dado
//Toda vez que vc atualiza uma variavel, o valor antigo � perdido par sempre.
numero, quantidade: inteiro
nome_aluno, nome_prof: caracter


Inicio
                          //ATRIBUI��O DE VARIAVEIS.

//DEVE SER FEITO A PARTIR DO INICIO

//Comando � := ou <-
//DOIS PONTOS IGUAL.
numero := 231654
nome_aluno <- "pedro"   //tem que ser entre aspas





Fimalgoritmo