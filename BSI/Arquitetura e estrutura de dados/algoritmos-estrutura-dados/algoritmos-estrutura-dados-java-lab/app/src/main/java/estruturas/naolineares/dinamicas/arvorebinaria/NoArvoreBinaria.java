package estruturas.naolineares.dinamicas.arvorebinaria;

public class NoArvoreBinaria<T>
        extends NoAbstratoArvoreBinaria<T, NoArvoreBinaria<T>> {

    public NoArvoreBinaria(T elemento) {
        super(elemento);
    }
}
