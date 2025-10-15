public interface ILivro {
    String getTitulo();
    void setTitulo(String titulo);
    String getAutor();
    void setAutor(String autor);
    int getAnoPublicacao();
    void setAnoPublicacao(int anoPublicacao);
    boolean estaDisponivel();
    void emprestar();
    void devolver();
    String toString();
}
