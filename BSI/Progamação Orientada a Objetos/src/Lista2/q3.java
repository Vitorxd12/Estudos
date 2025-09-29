package Lista2;

import java.util.function.Function;

public class q3 {
    //3. Crie uma Function<String, Integer> que receba uma palavra e retorne seu comprimento. Teste com as palavras: ”uva”, ”banana”e ”abacaxi”.
    public static void main(String[] args) {
        Function<String, Integer> comprimentoPalavra = (palavra) -> palavra.length();
        System.out.println("uva" + comprimentoPalavra.apply("uva"));
        System.out.println("banana" + comprimentoPalavra.apply("banana"));
    }
}
