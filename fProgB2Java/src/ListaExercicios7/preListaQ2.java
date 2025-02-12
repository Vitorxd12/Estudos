package ListaExercicios7;

/*
02 - Crie um programa para gerar 5 nimeros (até 20) e adicione em um vetor V.
A seguir, crie um vetor M que contém os elementos do vetor V multiplicados pelo
menor nimero do vetor V.

Exemplo:
V: 1564 19 09 11
Menor Nimero: 04
Mi 60 16 76 36 44

*/

import java.util.Random;

public class preListaQ2 {
    public static void main(String[] args) {
        int[] v = new int[5];
        int[] m = new int[5];
        int menNum = 0;
        Random rand = new Random();

        System.out.println("Vetor V: ");
        for (int i = 0; i < v.length; i++) {
            v[i] = rand.nextInt(20);
            System.out.print(v[i] + " ");
            if (menNum > v[i] || i == 0) {
                menNum = v[i];
            }
        }
        System.out.println("\nMenor Númeoro do Vetor V: " + menNum);
        System.out.println("Vetor M: ");
        for (int i = 0; i < m.length; i++) {
            m[i] = v[i] * menNum;
            System.out.print(m[i] + " ");
        }

    }
}
