import java.util.ArrayList;

public class Biblioteca implements IBiblioteca{

    private ArrayList<ILivro> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }


    public void adicionarLivro(ILivro livro) {
        acervo.add(livro);
        System.out.println("Livro adicionado com sucesso.");
    }

    public void removerLivro(String titulo) {
        ILivro livro = buscarLivro(titulo);
        if (livro != null) {
            acervo.remove(livro);
            System.out.println("Livro removido com sucesso.");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void emprestarLivro(String titulo) {
        ILivro livro = buscarLivro(titulo);
        if (livro != null) {
            if (livro.estaDisponivel()) {
                livro.emprestar();
                System.out.println("Livro emprestado com sucesso.");
            } else {
                System.out.println("Livro já está emprestado.");
            }
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void devolverLivro(String titulo) {
        ILivro livro = buscarLivro(titulo);
        if (livro != null) {
            if (!livro.estaDisponivel()) {
                livro.devolver();
                System.out.println("Livro devolvido com sucesso.");
            } else {
                System.out.println("Este livro já está disponível.");
            }
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void listarAcervo() {
        if (acervo.isEmpty()) {
            System.out.println("Acervo vazio.");
        } else {
            System.out.println("Livros disponíveis no acervo:");
            for (ILivro livro : acervo) {
                System.out.println(" - " + livro);
            }
        }
    }

    public ILivro buscarLivro(String titulo) {
        for (ILivro livro : acervo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

}
