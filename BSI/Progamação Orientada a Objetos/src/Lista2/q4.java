package Lista2;

import java.util.function.Consumer;

//4. Crie um Consumer<String> que imprima uma mensagem em mai´usculas. Use com: ”oi”,
//”bom dia”e ”lambda”.
public class q4 {
    public static void main(String[] args) {
        Consumer<String> imprimirMaiusc = s -> System.out.println(s.toUpperCase());
        imprimirMaiusc.accept("oi");
        imprimirMaiusc.accept("bom dia");
    }
}
