package estruturas.naolineares.dinamicas.arvore;

import java.util.Objects;

import estruturas.naolineares.dinamicas.arvore.IArvore;

public abstract class ArvoreAbstrata<T, N extends INoArvore<T>> implements IArvore<T, N> {
    private N noRaiz;

    protected abstract Iterable<N> filhosDe(N no);

    public N obterNoRaiz() {
        return noRaiz;
    }

    public void definirNoRaiz(N noRaiz) {
        this.noRaiz = noRaiz;
    }

    public int tamanho() {
        return this.estaVazia() ? 0 : this.obterNoRaiz().tamanho();
    }

    public int altura() {
        return this.estaVazia() ? -1 : this.obterNoRaiz().altura();
    }

    public int arestas() {
        return this.estaVazia() ? -1 : this.tamanho() - 1;
    }

    private int nivelNo(N no, T elemento, int nivelAtual) {
        if (no == null) return -1;
        if (Objects.equals(no.obterElemento(), elemento)) {
            return nivelAtual;
        }
        for (N filho : this.filhosDe(no)) {
            int nivel = this.nivelNo(filho, elemento, nivelAtual + 1);
            if (nivel != -1) return nivel;
        }
        return -1;
    }

     private int grau(N no) {
        if (this.estaVazia()) return -1;
        if (no == null) return -1;
        int grau = no.grau();
        for (N filho : this.filhosDe(no)) {
            grau = Math.max(grau, this.grau(filho));
        }
        return grau;
    }

    public int grau() {
        return this.estaVazia() ? -1 : this.grau(this.obterNoRaiz());
    }

    public int nivelNo(T elemento) {
        return this.nivelNo(this.obterNoRaiz(), elemento, 0);
    }

    public Iterable<N> recuperarIrmaosDe(T elemento) {
        return new java.util.ArrayList<>();
    }

}
