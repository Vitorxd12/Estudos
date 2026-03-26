import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Services {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void carregarDados() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/usuarios.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] linhas = line.split(",");
                if (linhas.length < 3) {
                    System.out.println("Linha ignorada (formato incorreto): " + line);
                    continue;
                }
                System.out.println("Nome: " + linhas[0] + ", Email: " + linhas[1] + ", Telefone: " + linhas[2]);
                Usuario usuario = new Usuario(linhas[0], linhas[1], linhas[2]);
                usuarios.add(usuario);
            }
            System.out.println("\nDados carregados com sucesso!\n-----------------------\n");
        } catch (IOException e) {
            // Handle exceptions such as FileNotFoundException or permission errors
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public ArrayList<Usuario> buscarUsuario(String busca) {
        if (busca.length() < 3) {
            System.out.println("A busca deve conter pelo menos 3 caracteres.");
            return new ArrayList<>(); // Retorna uma lista vazia
        }
        ArrayList<Usuario> lista = new ArrayList<>();
        System.out.println("-----------------\nBuscando por: '" + busca + "'\n--------------------\n");
        int contador = 0;
        for (Usuario usuario : usuarios) {
            String Usuario = usuario.buscarDados();
            Pattern pattern = Pattern.compile(busca, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
            Matcher matcher = pattern.matcher(Usuario);

            if (matcher.find()) {
                contador++;
                System.out.println( contador + "- Nome: " + usuario.getNome() + ", Email: " + usuario.getEmail() + ", Telefone: " + usuario.getTelefone());
                lista.add(usuario);
            }
        }
        if (lista.isEmpty()) {
            System.out.println("Nenhum resultado encontrado para: " + busca);
        } else {
            System.out.println(contador + " resultado(s) encontrado(s) para: " + busca);
        }
        return lista;
    }

    public void adicionarUsuario(String nome, String email, String telefone) {
        Usuario usuario = new Usuario(nome, email, telefone);
        usuarios.add(usuario);
        String novoItem = nome + ", " + email + ", " + telefone; // Formato CSV

        // O parâmetro 'true' ativa o modo APPEND
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/usuarios.txt", true))) {
            writer.newLine(); // Garante que começará em uma nova linha
            writer.write(novoItem);
            System.out.println("\n----------\n" + nome + " adicionado com sucesso!\n-----------------\n");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public void removerUsuario(String nome) {
        ArrayList<Usuario> usuariosEncontrados = buscarUsuario(nome);
        if (usuariosEncontrados.isEmpty()) {
            System.out.println("Como não há usuários encontrados, nenhum será removido.");
            return;
        }
        if (usuariosEncontrados.size() == 1) {
            realizarRemocao(usuariosEncontrados.get(0));
            return;
        }
        if (usuariosEncontrados.size() > 9) {
            System.out.println("Múltiplos mais do que 9. Por favor, especifique melhor a busca para remover apenas um usuário.");
            return;
        }
        if (usuariosEncontrados.size() < 9) {
            System.out.println("Múlitplos encontrados. Por favor, digite o número do usuário que deseja remover (1 - 9):");
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
            if (escolha < 1 || escolha > usuariosEncontrados.size()) {
                System.out.println("Escolha inválida. Nenhum usuário será removido.");
                return;
            } else {
                realizarRemocao(usuariosEncontrados.get(escolha - 1));
            }
        }
    }
    private void realizarRemocao(Usuario usuarioParaRemover) {
        // 1. Remover da lista em memória
        boolean removidoDaLista = usuarios.remove(usuarioParaRemover);

        if (removidoDaLista) {
            // 2. Sobrescrever o arquivo com a lista atualizada
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/usuarios.txt", false))) {
                for (int i = 0; i < usuarios.size(); i++) {
                    Usuario u = usuarios.get(i);
                    String linha = u.getNome() + "," + u.getEmail() + "," + u.getTelefone();
                    writer.write(linha);

                    // Adiciona nova linha apenas se não for o último elemento (evita linhas vazias no fim)
                    if (i < usuarios.size() - 1) {
                        writer.newLine();
                    }
                }
                System.out.println("\n[Sucesso] Usuário '" + usuarioParaRemover.getNome() + "' removido do sistema e do arquivo.");
            } catch (IOException e) {
                System.err.println("Erro ao atualizar o arquivo após remoção: " + e.getMessage());
            }
        } else {
            System.out.println("Erro: Usuário não encontrado na lista interna.");
        }
    }
}

