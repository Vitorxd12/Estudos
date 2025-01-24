package Aula_0_Preparatorio.ListasPortugolTraduzidas;

import java.util.Random;
import java.util.Scanner;
public class Lista4Q1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] v = new int[31];
        int cont = 0;
        System.out.println("Escreva um número de 0 até 50: ");
        int numero = scanner.nextInt();


        for (int i = 0; i < v.length; i++){
            v[i] =random.nextInt(50);
            System.out.print(v[i]);
            if (numero == v[i]){
                cont++;
                System.out.print(" <---");
            }
            System.out.println();
        }
        System.out.println("O número '" + numero + "' apareceu " + cont + " vezes.");
    }
}
