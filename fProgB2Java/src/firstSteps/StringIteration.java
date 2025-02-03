package firstSteps;

import java.util.Scanner;

public class StringIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //            "0123456789" <-- indices
        String nome = "Vitor Oliv";
        System.out.println(nome.toUpperCase()); //maiusculo
        System.out.println(nome.substring(3, 6)); //ITERAÇÃO vai pegar do primeiro digito + 1 e vai até o final.
        System.out.println(nome.length()); //tamanho do nome
        System.out.println(nome.charAt(2)); //caractere na posição  tal partindo do 0
        System.out.println(nome.indexOf('r')); //indice da letra r

    }
}
