public class LivroImpresso extends Livro {
    private int paginas;
    public LivroImpresso(String titulo, String autor, int anoPublicacao, int paginas) {
        super(titulo, autor, anoPublicacao);
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        String status = this.estaDisponivel() ? "Disponível" : "Indisponível";
        return this.getTitulo() + ", de " + this.getAutor() + " (" + this.getAnoPublicacao() + ") Páginas: "+ getPaginas()+ " - " + status;
    }

    public int getPaginas() { return this.paginas; }
    public void setPaginas(int paginas) { this.paginas = paginas; }
}