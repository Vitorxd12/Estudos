package estruturas.naolineares.dinamicas.arvore;

import java.util.function.Consumer;

public interface IPercursoPreOrdem<T> {

    void percorrerPreOrdem(Consumer<T> acao);
}
