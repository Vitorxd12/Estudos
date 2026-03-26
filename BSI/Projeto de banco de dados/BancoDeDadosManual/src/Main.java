import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Services services = new Services();
        Scanner scanner = new Scanner(System.in);

        // Carrega os dados do arquivo ao iniciar
        services.carregarDados();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- MENU DE GERENCIAMENTO ---");
            System.out.println("1. Buscar Usuário");
            System.out.println("2. Adicionar Novo Usuário");
            System.out.println("3. Remover Usuário");
            System.out.println("4. Listar Todos os Usuários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine()); // Evita problemas com o buffer do Scanner
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o termo de busca (mín. 3 letras): ");
                    String busca = scanner.nextLine();
                    services.buscarUsuario(busca);
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String tel = scanner.nextLine();
                    services.adicionarUsuario(nome, email, tel);
                    break;

                case 3:
                    System.out.print("Digite o nome do usuário que deseja remover: ");
                    String nomeRemover = scanner.nextLine();
                    services.removerUsuario(nomeRemover);
                    break;
                case 4:
                    services.listarUsuarios();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}