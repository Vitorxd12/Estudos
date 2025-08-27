package Lista2;

import java.util.function.UnaryOperator;

//5. Crie um UnaryOperator<Integer> que dobre um n´umero inteiro. Teste com 5, 10 e 25.
public class q5 {
    public static void main(String[] args) {
        UnaryOperator<Integer> dobrarNumero = n -> n*2;
        System.out.println(dobrarNumero.apply(5));   // 10
    }
}
