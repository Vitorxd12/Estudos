import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao;

        do {
            String titulo;
            String autor;
            int ano;

            System.out.println("\n MENU BIBLIOTECA");
            System.out.println("1. Adicionar livro impresso");
            System.out.println("2. Adicionar livro eletrônico");
            System.out.println("3. Adicionar livro em audio");
            System.out.println("4. Remover livro");
            System.out.println("5. Emprestar livro");
            System.out.println("6. Devolver livro");
            System.out.println("7. Listar acervo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    autor = sc.nextLine();
                    System.out.print("Ano de publicação: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Número de paginas: ");
                    int paginas =  sc.nextInt();
                    sc.nextLine();
                    biblioteca.adicionarLivro(new LivroImpresso(titulo, autor, ano, paginas));
                    break;
                case 2:
                    System.out.print("Título: ");
                    titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    autor = sc.nextLine();
                    System.out.print("Ano de publicação: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Tamnho do arquivo em MB");
                    int tamanho = sc.nextInt();
                    sc.nextLine();
                    biblioteca.adicionarLivro(new LivroEletronico(titulo, autor, ano, tamanho));
                    break;
                case 3:
                    System.out.print("Título: ");
                    titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    autor = sc.nextLine();
                    System.out.print("Ano de publicação: ");
                    ano = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Duração do livro em minutos: ");
                    int tempo = sc.nextInt();
                    sc.nextLine();
                    biblioteca.adicionarLivro(new LivroEmAudio(titulo, autor, ano, tempo));
                    break;
                case 4:
                    System.out.print("Título do livro a remover: ");
                    String tituloRemover = sc.nextLine();
                    biblioteca.removerLivro(tituloRemover);
                    break;
                case 5:
                    System.out.print("Título do livro para empréstimo: ");
                    String tituloEmprestar = sc.nextLine();
                    biblioteca.emprestarLivro(tituloEmprestar);
                    break;
                case 6:
                    System.out.print("Título do livro para devolução: ");
                    String tituloDevolver = sc.nextLine();
                    biblioteca.devolverLivro(tituloDevolver);
                    break;
                case 7:
                    biblioteca.listarAcervo();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
