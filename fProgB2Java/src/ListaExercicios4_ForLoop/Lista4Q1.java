package ListaExercicios4_ForLoop;
/*
01 - Construa um programa que gere e armazene em um vetor V 30 valores inteiros não negativos
(até 50). Depois que o vetor for preenchido, o programa deve pedir para o usuário informar um
número e mostrar quantos valores armazenados são iguais ao número informado pelo usuário.
*/

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
