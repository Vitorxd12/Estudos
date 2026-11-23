package estruturas.naolineares.dinamicas.arvore;

import java.util.function.Consumer;

public interface IPercursoEmOrdemDeNivel<T> {

    void percorrerEmOrdemDeNivel(Consumer<T> acao);
}
