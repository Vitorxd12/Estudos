public class LivroEletronico extends Livro {
    private int tamanho;

    public LivroEletronico(String titulo, String autor, int anoPublicacao, int paginas) {
        super(titulo, autor, anoPublicacao);
        this.tamanho = paginas;
    }

    @Override
    public String toString() {
        String status = this.estaDisponivel() ? "Disponível" : "Indisponível";
        return this.getTitulo() + ", de " + this.getAutor() + " (" + this.getAnoPublicacao() + ") Tamanho: "+ getTamanho()+ " MB - " + status;
    }

    public int getTamanho() { return this.tamanho; }
    public void setTamanho(int paginas) { this.tamanho = paginas; }
}