package Lista2;

import java.util.function.Supplier;

public class q2 {
    //2. Use um Supplier<Double> para gerar n´umeros aleat´orios entre 0 e 1. Imprima 5 valores.
    public static void main(String[] args) {
        Supplier<Double> numeroAleatorio = () -> Math.random();
        for (int i = 0; i < 5; i++) {
            System.out.println(numeroAleatorio.get());
        }
    }
}
