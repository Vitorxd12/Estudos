package estruturas.naolineares.dinamicas.arvorebinaria;

public class ArvoreBinariaSimples<T>
        extends ArvoreBinariaAbstrata<T, NoArvoreBinaria<T>> {

    public ArvoreBinariaSimples() {
    }

    public ArvoreBinariaSimples(NoArvoreBinaria<T> noRaiz) {
        this.definirNoRaiz(noRaiz);
    }
}
