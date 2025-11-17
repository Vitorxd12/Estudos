package algoritimos.recursivos;

import java.util.Arrays;

public class Fibonacci {

    private static final int N_TESTE = 40;

    public static int fibonacciRecursivo(int n){
        if ((n == 0) || (n == 1)){
            return n;
        }
        else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }

    public static int fibonacciRecursivoMemorizado(int n) {
        long[] memo = new long[n + 1];
        Arrays.fill(memo, -1);
        return (int) fibonacciMemoAux(n, memo);
    }

    private static long fibonacciMemoAux(int n, long[] memo) {
        if (n <= 1) {
            return n;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = fibonacciMemoAux(n - 1, memo) + fibonacciMemoAux(n - 2, memo);
        return memo[n];
    }


    public static int fibonacciIterativo(int n) {
        if (n == 0 || n == 1){
            return n;
        }

        int fibAnterior = 0;
        int fibPosterior = 1;
        int fibonacci = 0;

        for (int i = 2; i <= n; i++){
            fibonacci = fibAnterior + fibPosterior;
            fibAnterior = fibPosterior;
            fibPosterior = fibonacci;
        }
        return fibonacci;
    }


    public static void main(String[] args) {
        int n = N_TESTE;
        System.out.println("--- Comparação de Desempenho para F(" + n + ") ---\n");

        int resultadoRecursivo = 0;
        long tempoRecursivo = 0;

        System.out.println("1. Executando versão Recursiva Ingênua (O(2^n))... Aguarde...");
        try {
            long inicioRecursivo = System.nanoTime();
            resultadoRecursivo = fibonacciRecursivo(n);
            long fimRecursivo = System.nanoTime();
            tempoRecursivo = fimRecursivo - inicioRecursivo;
        } catch (StackOverflowError e) {
            System.err.println("Erro: Stack Overflow para n = " + n + ". Tente um valor de N menor.");
            return;
        }
        System.out.println("Finalizado.");


        System.out.println("2. Executando versão Iterativa (O(n))...");
        long inicioIterativo = System.nanoTime();
        int resultadoIterativo = fibonacciIterativo(n);
        long fimIterativo = System.nanoTime();
        long tempoIterativo = fimIterativo - inicioIterativo;
        System.out.println("Finalizado.");


        System.out.println("3. Executando versão Recursiva Memorizada (O(n))...");
        long inicioMemorizado = System.nanoTime();
        int resultadoMemorizado = fibonacciRecursivoMemorizado(n);
        long fimMemorizado = System.nanoTime();
        long tempoMemorizado = fimMemorizado - inicioMemorizado;
        System.out.println("Finalizado.\n");


        System.out.println("------------------------------------------------------------------");
        System.out.println("Resultado de Fibonacci F(" + n + "): " + resultadoRecursivo);
        System.out.println("------------------------------------------------------------------");

        System.out.println("ABORDAGEM:          | RESULTADO:  | TEMPO (ns):          | COMPLEXIDADE:");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("1. Recursiva Ingênua:  | %-11d | %-20d  | O(2^n)\n", resultadoRecursivo, tempoRecursivo);
        System.out.printf("2. Iterativa (Bottom-Up): | %-11d | %-20d  | O(n)\n", resultadoIterativo, tempoIterativo);
        System.out.printf("3. Memorizada (Top-Down): | %-11d | %-20d  | O(n)\n", resultadoMemorizado, tempoMemorizado);
        System.out.println("------------------------------------------------------------------");

        System.out.println("\nANÁLISE DE PERFORMANCE:");
        System.out.println("A otimização de Programação Dinâmica (Memorizada e Iterativa)");
        System.out.println("demonstra uma redução drástica de tempo de O(2^n) para O(n).");
        System.out.println("Diferença (Recursiva Ingênua - Iterativa): " + (tempoRecursivo - tempoIterativo) + " ns");
        System.out.println("Diferença (Recursiva Ingênua - Memorizada): " + (tempoRecursivo - tempoMemorizado) + " ns");
    }
}
