public class Livro {
    private String titulo;
    private String autor;
    private String ano;
    private boolean emprestado;

    public Livro(String titulo, String autor, String ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        emprestado = false;
    }
    public void emprestar() {
        this.emprestado = true;
    }
    public void devolver() {
        this.emprestado = false;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getAno() {
        return ano;
    }
    public boolean isEmprestado() {
        return emprestado;
    }
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano: " + ano;
    }
    public String toCSV(){
        return titulo + "," + autor + "," + ano + "," + emprestado + "\n";
    }
}
