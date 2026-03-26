import java.io.*;
import java.util.ArrayList;
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
        } catch (IOException e) {
            // Handle exceptions such as FileNotFoundException or permission errors
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public ArrayList<Usuario> buscarUsuario(String busca) {
        ArrayList<Usuario> lista = new ArrayList<>();
        System.out.println("Buscando por: '" + busca + "'\nResultados encontrados:");
        for (Usuario usuario : usuarios) {
            String Usuario = usuario.buscarDados();
            ;
            Pattern pattern = Pattern.compile(busca, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
            Matcher matcher = pattern.matcher(Usuario);

            if (matcher.find()) {
                System.out.println("Nome: " + usuario.getNome() + ", Email: " + usuario.getEmail() + ", Telefone: " + usuario.getTelefone());
                lista.add(usuario);

            }
        }
        if (lista.isEmpty()) {
            System.out.println("Nenhum resultado encontrado para: " + busca);
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
            System.out.println("Item adicionado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}

