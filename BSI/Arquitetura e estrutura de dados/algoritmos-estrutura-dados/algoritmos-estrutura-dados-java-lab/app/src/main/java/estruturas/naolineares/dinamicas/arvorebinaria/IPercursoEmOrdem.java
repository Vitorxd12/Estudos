package estruturas.naolineares.dinamicas.arvorebinaria;

import java.util.function.Consumer;

public interface IPercursoEmOrdem<T> {

    void percorrerEmOrdem(Consumer<T> acao);
}
