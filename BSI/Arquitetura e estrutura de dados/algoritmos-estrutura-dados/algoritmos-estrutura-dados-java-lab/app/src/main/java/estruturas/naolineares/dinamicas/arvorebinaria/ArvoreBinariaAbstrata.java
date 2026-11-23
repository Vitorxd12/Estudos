package estruturas.naolineares.dinamicas.arvorebinaria;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.function.Consumer;

import estruturas.naolineares.dinamicas.arvore.ArvoreAbstrata;

public abstract class ArvoreBinariaAbstrata<T, N extends INoArvoreBinaria<T, N>>
        extends ArvoreAbstrata<T, N> implements IArvoreBinaria<T, N> {

    @Override
    protected Iterable<N> filhosDe(N no) {
        List<N> filhos = new ArrayList<>(2);
        if (no.obterNoEsquerdo() != null) filhos.add(no.obterNoEsquerdo());
        if (no.obterNoDireito() != null) filhos.add(no.obterNoDireito());
        return filhos;
    }

    @Override
    public void percorrerPreOrdem(Consumer<T> acao) {
        Objects.requireNonNull(acao, "A ação não pode ser nula");
        this.percorrerPreOrdem(this.obterNoRaiz(), acao);
    }

    private void percorrerPreOrdem(N no, Consumer<T> acao) {
        if (no == null) return;
        acao.accept(no.obterElemento());
        this.percorrerPreOrdem(no.obterNoEsquerdo(), acao);
        this.percorrerPreOrdem(no.obterNoDireito(), acao);
    }

    @Override
    public void percorrerEmOrdem(Consumer<T> acao) {
        Objects.requireNonNull(acao, "A ação não pode ser nula");
        this.percorrerEmOrdem(this.obterNoRaiz(), acao);
    }

    private void percorrerEmOrdem(N no, Consumer<T> acao) {
        if (no == null) return;
        this.percorrerEmOrdem(no.obterNoEsquerdo(), acao);
        acao.accept(no.obterElemento());
        this.percorrerEmOrdem(no.obterNoDireito(), acao);
    }

    @Override
    public void percorrerPosOrdem(Consumer<T> acao) {
        Objects.requireNonNull(acao, "A ação não pode ser nula");
        this.percorrerPosOrdem(this.obterNoRaiz(), acao);
    }

    private void percorrerPosOrdem(N no, Consumer<T> acao) {
        if (no == null) return;
        this.percorrerPosOrdem(no.obterNoEsquerdo(), acao);
        this.percorrerPosOrdem(no.obterNoDireito(), acao);
        acao.accept(no.obterElemento());
    }

    @Override
    public void percorrerEmOrdemDeNivel(Consumer<T> acao) {
        Objects.requireNonNull(acao, "A ação não pode ser nula");
        N raiz = this.obterNoRaiz();
        if (raiz == null) return;

        Queue<N> fila = new ArrayDeque<>();
        fila.add(raiz);
        while (!fila.isEmpty()) {
            N no = fila.remove();
            acao.accept(no.obterElemento());
            if (no.obterNoEsquerdo() != null) fila.add(no.obterNoEsquerdo());
            if (no.obterNoDireito() != null) fila.add(no.obterNoDireito());
        }
    }

    @Override
    public boolean verificarIsomorfiaCom(IArvoreBinaria<?, ?> outraArvore) {
        if (outraArvore == null) return false;
        return this.verificarIsomorfiaCom(this.obterNoRaiz(), outraArvore.obterNoRaiz());
    }

    private boolean verificarIsomorfiaCom(
            INoArvoreBinaria<?, ?> no,
            INoArvoreBinaria<?, ?> outroNo) {
        if (no == null || outroNo == null) return no == outroNo;

        // A isomorfia depende apenas da presença dos filhos, não dos elementos.
        return this.verificarIsomorfiaCom(no.obterNoEsquerdo(), outroNo.obterNoEsquerdo())
                && this.verificarIsomorfiaCom(no.obterNoDireito(), outroNo.obterNoDireito());
    }
}
