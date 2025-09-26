import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo;
    public Biblioteca(){
        this.acervo = new ArrayList<>();
    }
    public int encontrarIndiceComTitulo(String titulo){
        for(int i = 0; i < acervo.size(); i++){
            if(acervo.get(i).getTitulo().equals(titulo)){
                return i;
            }
        }
        System.out.println("Livro não encontrado no acervo." );
        return -1;
    }


    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
        System.out.println("Livro adicionado: " + livro.toString());
    }
    public void removerLivro(String titulo) {
        int indice = encontrarIndiceComTitulo(titulo);
        if(indice != -1){
            acervo.remove(indice);
            System.out.println("Livro removido: " + titulo);
        }
    }
    public void emprestarLivro(String titulo){
        int indice = encontrarIndiceComTitulo(titulo);
        if(indice != -1){
            if(acervo.get(indice).isEmprestado()){
                System.out.println("Livro já está emprestado: " + titulo);
            } else {
                acervo.get(indice).emprestar();
                System.out.println("Emprestando livro: " + titulo);
            }
        }
    }
    public void devolverLivro(String titulo){
        int indice = encontrarIndiceComTitulo(titulo);
        if(indice != -1){
            if(acervo.get(indice).isEmprestado()){
                acervo.get(indice).devolver();
                System.out.println("Devolvendo livro: " + titulo);
            } else {
                System.out.println("Livro não está emprestado: " + titulo);
            }
        }
    }
    public void listarAcervo() {
        if(acervo.isEmpty()){
            System.out.println("Acervo vazio.");
        } else {
            System.out.println("Acervo da Biblioteca:");
            for (Livro livro : acervo) {
                String status = livro.isEmprestado() ? " (Emprestado)" : " (Disponível)";
                System.out.println(livro.toString() + status);
            }
        }
    }
    public List<Livro> getAcervo(){
        return acervo;
    }
}
