package Interface;

@FunctionalInterface
interface TesteNumero {
    boolean testar(int numero);
}
public class Ex1 {
    public static void main(String[] args){
        TesteNumero multiploDe3e5 = (numero) -> {
            return numero % 3 == 0 && numero % 5 == 0;
        };
        System.out.println(multiploDe3e5.testar(15)); // true
        System.out.println(multiploDe3e5.testar(9));  // false
    }
}
