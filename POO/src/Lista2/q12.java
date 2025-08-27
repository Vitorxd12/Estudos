package Lista2;
import java.util.function.Predicate;
public class q12{
    public static void main(String[] args) {
        Predicate<String> comecaComA = s -> s.startsWith("a")|| s.startsWith("A");
        Predicate<String> terminaComZ = s -> s.endsWith("z") || s.endsWith("Z");
        String teste = "AbcZ";
        System.out.println(comecaComA.test(teste));
        System.out.println(terminaComZ.test(teste));
    }
}
