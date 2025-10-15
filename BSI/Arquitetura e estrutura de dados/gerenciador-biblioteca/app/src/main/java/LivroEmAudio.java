public class LivroEmAudio extends Livro {
    private int tempo;
    public LivroEmAudio(String titulo, String autor, int anoPublicacao, int paginas) {
        super(titulo, autor, anoPublicacao);
        this.tempo = paginas;
    }

    @Override
    public String toString() {
        String status = this.estaDisponivel() ? "Disponível" : "Indisponível";
        return this.getTitulo() + ", de " + this.getAutor() + " (" + this.getAnoPublicacao() + ") Tempo: "+ getTempo()+ " min - " + status;
    }

    public int getTempo() { return this.tempo; }
    public void setTempo(int paginas) { this.tempo = paginas; }
}