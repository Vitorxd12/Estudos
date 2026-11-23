package estruturas.naolineares.dinamicas.arvorebinaria;

public abstract class NoAbstratoArvoreBinaria<T, N extends INoArvoreBinaria<T, N>>
        implements INoArvoreBinaria<T, N> {

    private T elemento;
    private N noEsquerdo;
    private N noDireito;

    protected NoAbstratoArvoreBinaria(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public T obterElemento() {
        return this.elemento;
    }

    @Override
    public void definirElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public N obterNoEsquerdo() {
        return this.noEsquerdo;
    }

    @Override
    public void definirNoEsquerdo(N noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    @Override
    public N obterNoDireito() {
        return this.noDireito;
    }

    @Override
    public void definirNoDireito(N noDireito) {
        this.noDireito = noDireito;
    }

    @Override
    public int tamanho() {
        int tamanhoEsquerdo = this.noEsquerdo == null ? 0 : this.noEsquerdo.tamanho();
        int tamanhoDireito = this.noDireito == null ? 0 : this.noDireito.tamanho();
        return 1 + tamanhoEsquerdo + tamanhoDireito;
    }

    @Override
    public int altura() {
        int alturaEsquerda = this.noEsquerdo == null ? -1 : this.noEsquerdo.altura();
        int alturaDireita = this.noDireito == null ? -1 : this.noDireito.altura();
        return 1 + Math.max(alturaEsquerda, alturaDireita);
    }

    @Override
    public int grau() {
        int grau = 0;
        if (this.noEsquerdo != null) grau++;
        if (this.noDireito != null) grau++;
        return grau;
    }
}
