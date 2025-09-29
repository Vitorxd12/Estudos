import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class Parser {
    public Parser() {
    }

    public void inicializar(Biblioteca biblioteca) {
        String path = "src/acervo.csv";
        try (FileReader reader = new FileReader(path)) {
            StringBuilder sb = new StringBuilder();
            int i;
            while ((i = reader.read()) != -1) {
                sb.append((char) i);
            }
            String[] linhas = sb.toString().split("\n");
            CSVtoLivro(linhas, biblioteca);
        } catch (Exception e) {
            System.out.println("Erro ao ler CSV: " + e.getMessage());
        }
    }

    public void CSVtoLivro(String[] linhas, Biblioteca biblioteca) {
        for (int i = 0; i < linhas.length; i++){
            String[] dados = linhas[i].split(",");
            String titulo = dados[0];
            String autor = dados[1];
            String ano = dados[2];
            Livro livro = new Livro(titulo, autor, ano);
            biblioteca.adicionarLivro(livro);
            System.out.println("Livro adicionado: " + livro.toString());
        }
    }

    public void salvar(List<Livro> livros) {
        for (Livro livro : livros) {
            System.out.println(livro.toCSV());
        }
        String path = "src/acervo.csv";
        try (FileWriter writer = new FileWriter(path)) {
            for (Livro livro : livros) {
                writer.write(livro.toCSV());
            }
        } catch (Exception e) {
            System.out.println("Erro ao salvar CSV: " + e.getMessage());
        }
    }
}