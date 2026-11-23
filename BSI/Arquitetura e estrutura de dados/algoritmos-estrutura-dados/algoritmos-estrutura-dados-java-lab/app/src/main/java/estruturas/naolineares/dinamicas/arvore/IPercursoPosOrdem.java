package estruturas.naolineares.dinamicas.arvore;

import java.util.function.Consumer;

public interface IPercursoPosOrdem<T> {

    void percorrerPosOrdem(Consumer<T> acao);
}
