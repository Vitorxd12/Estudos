public interface IBiblioteca {
    void adicionarLivro(ILivro livro);
    void removerLivro(String titulo);
    void emprestarLivro(String titulo);
    void devolverLivro(String titulo);
    void listarAcervo();
    ILivro buscarLivro(String titulo);
}
