package Interface;
@FunctionalInterface
interface Operacao {
    int aplicar(int a, int b);
}
public class Ex3 {
    public static void main(String[] args) {
        Operacao soma = (a, b) -> a + b;
        Operacao subtracao = (a, b) -> a - b;
        Operacao maiorEntreNumeros = (a, b) -> {
            if (a > b) {
                return a;
            } else if (b > a) {
                return b;
            } else {
                return 0; // Retorna 0 se forem iguais
            }
        };

        int a = 6;
        int b = 5;
        System.out.println(soma.aplicar(a, b));
        System.out.println(subtracao.aplicar(a, b));
        System.out.println(maiorEntreNumeros.aplicar(a, b)); // 5
    }
}
