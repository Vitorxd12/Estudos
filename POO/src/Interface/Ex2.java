package Interface;

@FunctionalInterface
interface ValidadorEmail {
    boolean ehInvalido(String email);
}

public class Ex2 {
    public static void main(String[] args) {
        ValidadorEmail lambda = (email) -> {
            if (email == null || email.isEmpty()) {
                return true; // Email é inválido se for nulo ou vazio
            }
            // Verifica se contém '@' e um domínio após ele
            return !email.contains("@") || email.indexOf('@') == email.length() - 1;
        };
        System.out.println(lambda.ehInvalido("Vitorxd12@gmail.com")); // false
    }

}

