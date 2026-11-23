package estruturas.naolineares.dinamicas.arvorebinaria;

import estruturas.naolineares.dinamicas.arvore.IArvore;
import estruturas.naolineares.dinamicas.arvore.IPercursoEmOrdemDeNivel;
import estruturas.naolineares.dinamicas.arvore.IPercursoPosOrdem;
import estruturas.naolineares.dinamicas.arvore.IPercursoPreOrdem;

public interface IArvoreBinaria<T, N extends INoArvoreBinaria<T, N>>
        extends IArvore<T, N>, IPercursoPreOrdem<T>, IPercursoEmOrdem<T>,
        IPercursoPosOrdem<T>, IPercursoEmOrdemDeNivel<T> {

    boolean verificarIsomorfiaCom(IArvoreBinaria<?, ?> outraArvore);
}
