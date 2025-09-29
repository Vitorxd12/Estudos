package ListaExercicios5_ForLoop;

import java.util.Scanner;

/*
01 - Elaborar um programa em JAVA para ler um número de 4 dígitos. A seguir, informe o
número invertido.
Exemplo: 4739  9374
*/
public class q1 {
    public static void main(String[] args) {
        //SOLUÇÃO COM STRINGS
        System.out.println("Digite: ");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        char[] numInv = new char[num.length()];
        for (int i = 0; i < num.length(); i++) {
            numInv[i] = num.charAt(i);
        }
        for (int i = numInv.length - 1; i >= 0; i--) {
            System.out.print(numInv[i]);
        }
        //SOLUÇÃO COM INTEIRO
        System.out.println("\nDigite um número: ");
        int numero = scanner.nextInt();
        int un = numero % 10; //Unidade
        int dz = ((numero % 100) - (numero % 10)) / 10; //Dezena
        int ct = ((numero % 1000) - (numero % 100)) / 100; //Centena
        int ml = numero / 1000; //Milhar
        System.out.println(un + "" + dz + "" + ct + "" + ml);

    }
}
