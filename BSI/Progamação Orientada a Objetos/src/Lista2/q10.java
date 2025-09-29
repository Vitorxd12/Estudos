package Lista2;

import javax.crypto.spec.PSource;
import java.util.function.Predicate;

//10. Crie um Predicate<Integer> que verifica se um n´umero ´e par e depois use negate()
//para criar outro que verifica se ´e ´ımpar. Teste com 3 n´umeros.
public class q10 {
    public static void main(String[] args) {
        Predicate<Integer> isPar = n -> n%2==0;
        System.out.println("é par");
        System.out.println(isPar.test(5));
        System.out.println(isPar.test(6));
        System.out.println("é impar");
        System.out.println(isPar.negate().test(5));
        System.out.println(isPar.negate().test(6));

    }
}
