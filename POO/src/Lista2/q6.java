package Lista2;

import java.util.function.BinaryOperator;

//Crie um BinaryOperator<Integer> que calcule o maior entre dois inteiros usando Math.max.
//Teste com os pares (3, 5), (10, 7) e (8, 8).
public class q6 {
    public static void main(String[] args) {
        BinaryOperator<Integer> getMaior = (a, b) -> Math.max(a, b);
        System.out.println(getMaior.apply(3, 5));   // 5
        System.out.println(getMaior.apply(10, 7));  // 10
        System.out.println(getMaior.apply(8, 8));   // 8
    }
}
