package estruturas.naolineares.dinamicas.arvoregeral;

import java.util.ArrayList;

import estruturas.lineares.dinamicas.lista.ListaSimplesmenteEncadeada;
import estruturas.naolineares.dinamicas.arvore.INoArvoreNaria;

public abstract class NoAbstratoArvoreGeral <T, N extends INoArvoreNaria<T, N>> implements INoArvoreNaria<T, N> {
    private T elemento;
    private ArrayList<N> filhos;

    public NoAbstratoArvoreGeral(T elemento) {
        this.elemento = elemento;
        this.filhos = new ArrayList<>();
    }
    public T obterElemento() {
        return this.elemento;
    }
    public void definirElemento(T elemento) {
        this.elemento = elemento;
    }
    public int tamanho() {
        int tamanho = 1;
        for (N filho : this.filhos) {
            tamanho += filho.tamanho();
        }
        return tamanho;
    }
    public int altura() {
        int altura = 0;
        for (N filho : this.filhos) {
            altura = Math.max(altura, filho.altura());
        }
        return altura + 1;
    }
    public int grau() {
        return this.filhos.size();
    }
    @Override
    public Iterable<N> obterFilhos() {
        return this.filhos;
    }
    public void adicionarFilho(N filho) {
        this.filhos.add(filho);
    }
    public void removerFilho(N filho) {
        this.filhos.remove(filho);
    }
}