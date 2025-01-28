package Challanges;
import java.util.Scanner;
/*
Exercício: Gerenciamento de Estoque de Produtos

Você foi contratado para desenvolver um programa que gerencie o estoque de uma loja. Para isso, você deverá implementar um programa que:
Armazene as informações de até 50 produtos em vetores.
Cada produto deve ter os seguintes dados:
Nome do produto (string).
Quantidade em estoque (inteiro).
Preço unitário (float).
O programa deve ter as seguintes funcionalidades:

Adicionar Produto: Permitir ao usuário adicionar os dados de um novo produto ao vetor.
Atualizar Estoque: Permitir ao usuário atualizar a quantidade de um produto existente.
Consultar Produto: Buscar um produto pelo nome e exibir suas informações (nome, quantidade e preço).
Listar Produtos: Exibir a lista completa de produtos com suas informações.
Valor Total do Estoque: Calcular e exibir o valor total do estoque (quantidade × preço de cada produto, somando todos os produtos).
Regras:
O programa deve usar laços de repetição e condicionais.
Garantir que não sejam adicionados mais de 50 produtos.
Permitir ao usuário navegar por um menu de opções até que ele escolha sair.
*/
public class WareHouse {

    //Vetores, variáveis e classes globais
    Scanner sc = new Scanner(System.in);
    int capacDoEstoq = 50;
    int num = 0;
    String nomeBusca = "";
    int[] vId = new int[capacDoEstoq];
    int[] vQtd = new int[capacDoEstoq];
    String[] vNom = new String[capacDoEstoq];
    double[] vVal = new double[capacDoEstoq];
    boolean[] vIdInUse = new boolean[capacDoEstoq];


    public static void main(String[] args) {
        //Variáveis e classes do menu.
        Scanner sc = new Scanner(System.in);
        WareHouse almox = new WareHouse();
        int menu = 0;

        //Menu
        while (menu < 7) {
            System.out.println("== MENU == \n1. Adicionar Produto\n2. Rezervar Produto\n3. Consultar Produto\n4. Listar Produtos\n5. Valor Total do Estoque\n6. Sair\nEscolha uma opção: ");
            menu = sc.nextInt();
            if (menu == 1) {
                almox.adiciona();
            } else if (menu == 2) {
                almox.rezerva();
            } else if (menu == 3) {
                almox.consultaPorNome();
            } else if (menu == 4) {
                almox.lista();
            } else if (menu == 5) {
                almox.valorTotal();
            } else if (menu == 6) {
                System.out.println("Saindo do Sistema");
                menu = 7;
            } else {
                System.out.println("Escolha um valor válido! ");
                menu = 0;
            }
        }
        sc.close();
    }


    //Adicionar itens ao estoque
    public void adiciona() {
        System.out.println("==Adicionar Produto==");

        //Busca se o nome já está em uso
        System.out.print("Digite o nome do produto: ");
        nomeBusca = sc.nextLine().toUpperCase();
        for (int i = 0; i < capacDoEstoq; i++) {
            if (vNom[i] == null) {
                break; //finaliza busca quando encontra string null
            } else if (vNom[i].equals(nomeBusca)) {
                System.out.println("Este produto já foi cadastrado! escolha outro nome.");
                System.out.print("Digite o nome do produto: ");
                nomeBusca = sc.nextLine().toUpperCase();
                i = 0; //reinicia o for para testar novo nome
            }
        }
        //Busca pelo proximo id disponivel. quando encontrado, torna ele indisponivel.
        for (int i = 0; i < capacDoEstoq; i++) {
            if (vIdInUse[i] == false) {
                vId[i] = i;

                vNom[vId[i]] = nomeBusca;
                System.out.print("Digite a quantidade de produtos: ");
                vQtd[vId[i]] = sc.nextInt();
                sc.nextLine();
                System.out.print("Digite o preço do produto: ");
                vVal[vId[i]] = sc.nextDouble();
                System.out.print("Seu produto foi adicionado com o id " + vId[i] + " com sucesso!\n");
                sc.nextLine();
                vIdInUse[i] = true;
                break;
            }
        }
        System.out.println("Aperte enter para voltar ao menu.");
        sc.nextLine();
    }


    //Subitrair itens do estoque.
    public void rezerva() {
        System.out.println("==Rezervar Produto==");
        //Sistema de busca
        System.out.print("Digite o nome do produto que deseja rezervar: ");
        nomeBusca = sc.nextLine().toUpperCase();
        for (int i = 0; i < capacDoEstoq; i++) {
            if (vNom[i] == null) {
                System.out.println("Fim da busca.");
                break; //para a busca quando atinge os valores não cadastraddos de nome.
            } else if (vNom[i].equals(nomeBusca)) { //mostra todos os dados encontrados
                System.out.println(vNom[i] + "(Id: " + vId[i] + ")");
                System.out.println("Quantidade: " + vQtd[i]);
                System.out.println("Custo: " + vVal[i]);
            }
            System.out.println("Quantas unidades do produto deseja rezervar?");
            num = sc.nextInt();
            if ((num > vQtd[i]) || (num < 0)) { //checa valicicidade do request
                System.out.println("Não há esta quantidade de produtos em estoque!");
                i = i - 1;
            } else { //rezerva
                System.out.println("O produto " + vNom[i] + " foi rezervado com sucesso!\n" + "Foram subtraidas " + num + " undidades do produto, restando " + (vQtd[i] - num) + " no estoque."  );
                vQtd[i] = vQtd[i] - num;
            }
        }
        System.out.println("Aperte enter para voltar ao menu.");
        sc.nextLine();
    }


    //sistema de busca, igual aos anteriores
    public void consultaPorNome() {
        System.out.println("==Consultar produto== ");
        System.out.print("Digite o nome do produto: ");
        nomeBusca = sc.nextLine().toUpperCase();
        for (int i = 0; i < capacDoEstoq; i++) {
            if (vNom[i] == null) {
                System.out.println("Fim da busca.");
                break;
            } else if (vNom[i].equals(nomeBusca)) {
                System.out.println(vNom[i] + "(Id: " + vId[i] + ")");
                System.out.println("Quantidade: " + vQtd[i]);
                System.out.println("Custo: " + vVal[i]);
            }
        }
        System.out.println("Aperte enter para voltar ao menu.");
        sc.nextLine();
    }


    //lista todos os itens usando o sistema de ids
    public void lista() {
        System.out.println("==Lista de todos os Produtos==");
        System.out.println("+----------------------------+");
        for (int i = 0; i < capacDoEstoq; i++) {
            System.out.println(vNom[i] + "(Id: " + vId[i] + ")");
            System.out.println("Quantidade: " + vQtd[i]);
            System.out.println("Custo: " + vVal[i]);
            System.out.println("+----------------------------+");
            if (vIdInUse[i + 1] == false) { // se o id do proximo loop não estiver em uso, pare
                break;
            }
        }
        System.out.println("Aperte enter para voltar ao menu.");
        sc.nextLine();
    }


    //Valor total de todos os itens do estoque. uma soma simples.
    public void valorTotal() {
        double total = 0;
        for (int i = 0; i < capacDoEstoq; i++) {
            if (vNom[i] == null) {
                break;
            } else {
                System.out.println("Custo com " + vNom[i] + ": " + vVal[i] * vQtd[i] + "R$");
                total += vVal[i] * vQtd[i];
            }
        } System.out.println("Total de todos os produtos: " + total);
        System.out.println("Aperte enter para voltar ao menu.");
        sc.nextLine();
    }
}