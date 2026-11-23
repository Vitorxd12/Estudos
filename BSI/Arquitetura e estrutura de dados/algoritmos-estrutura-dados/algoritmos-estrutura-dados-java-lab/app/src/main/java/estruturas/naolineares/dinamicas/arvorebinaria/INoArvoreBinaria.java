package estruturas.naolineares.dinamicas.arvorebinaria;

import estruturas.naolineares.dinamicas.arvore.INoArvore;

public interface INoArvoreBinaria<T, N extends INoArvoreBinaria<T, N>> extends INoArvore<T> {

    N obterNoEsquerdo();

    void definirNoEsquerdo(N noEsquerdo);

    N obterNoDireito();

    void definirNoDireito(N noDireito);
}
