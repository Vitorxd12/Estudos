package Lista2;

import java.util.function.Predicate;

public class q1 {
    //Crie um Predicate<String> que verifica se uma senha tem pelo menos 8 caracteres.
    //Teste com 3 exemplos.
    public static void main(String[] args) {
        //estou guardando uma variavel do tipo predicado que recebe uma função lambda
        //na função lmbda eu entrego uma string e retorno um booleano
        Predicate<String> senhaValida = senha -> senha.length() >= 8;
        String senha1 = "12345678";
        String senha2 = "1234";
        String senha3 = "1234567890";
        System.out.println("Senha 1 é válida? " + senhaValida.test(senha1)); // true
        System.out.println("Senha 2 é válida? " + senhaValida.test(senha2)); // false
        System.out.println("Senha 3 é válida? " + senhaValida.test(senha3)); // true

    }
}
