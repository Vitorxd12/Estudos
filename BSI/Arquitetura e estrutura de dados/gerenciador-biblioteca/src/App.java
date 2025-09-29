import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parser parser = new Parser();
        Biblioteca biblioteca = new Biblioteca();
        parser.inicializar(biblioteca);
        int opcao;

        do {
            System.out.println("\n MENU BIBLIOTECA");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Remover livro");
            System.out.println("3. Emprestar livro");
            System.out.println("4. Devolver livro");
            System.out.println("5. Listar acervo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Ano de publicação: ");
                    String ano = sc.nextLine();
                    biblioteca.adicionarLivro(new Livro(titulo, autor, ano));
                    break;
                case 2:
                    System.out.print("Título do livro a remover: ");
                    String tituloRemover = sc.nextLine();
                    biblioteca.removerLivro(tituloRemover);
                    break;
                case 3:
                    System.out.print("Título do livro para empréstimo: ");
                    String tituloEmprestar = sc.nextLine();
                    biblioteca.emprestarLivro(tituloEmprestar);
                    break;
                case 4:
                    System.out.print("Título do livro para devolução: ");
                    String tituloDevolver = sc.nextLine();
                    biblioteca.devolverLivro(tituloDevolver);
                    break;
                case 5:
                    biblioteca.listarAcervo();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
        parser.salvar(biblioteca.getAcervo());
        sc.close();
    }
}
