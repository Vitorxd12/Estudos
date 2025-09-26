package ListaExercicos8_Vectors;

import java.util.Random;
import java.util.Scanner;

/*
01 - Leia a idade de 10 alunos e armazene em um vetor V. A seguir, crie 04 vetores:
 - adicione em um vetor P as idades pares do vetor V;
- adicione em um vetor I as idades ímpares do vetor V;
- adicione em um vetor IDMAIMEDP as idades maiores que a média dos valores do vetor P;
- adicione em um vetor IDMENMENI as idades menores que a média dos valores do vetor I;
*/
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numAlunos = 10;
        int contIdaPar = 0, contIdaImp = 0;
        int somaPar = 0, somaImp = 0;
        double mediaPar = 0, mediaImp = 0;
        int[] idaAlunos = new int[numAlunos];
        int[] idaPares = new int[numAlunos];
        int[] idaImpar = new int[numAlunos];
        int[] IDMAIMEDP = new int[numAlunos];
        int[] IDMENMENI = new int[numAlunos];

        System.out.println("Idade dos alunos:");
        for (int i = 0; i < numAlunos; i++) {
            //Gerador de idades
            idaAlunos[i] = rand.nextInt(15) + 10;
            System.out.print(idaAlunos[i] + " ");

            //Colocar idades impares e pares em seus respectivos vetores, usando contadores separados para evitar buracos.
            if (idaAlunos[i] % 2 == 0) {
                idaPares[contIdaPar] = idaAlunos[i];
                contIdaPar++;
            } else {
                idaImpar[contIdaImp] = idaAlunos[i];
                contIdaImp++;
            }
        }
        //Printar idades pares:
        System.out.println("\n\nIdades pares: ");
        for (int i = 0; i < idaPares.length; i++) {
            somaPar += idaPares[i];
            if (idaPares[i] == 0) {
                i = idaPares.length;
            } else {
                System.out.print(idaPares[i] + " ");
            }
        }
        //Printar idades impares:
        System.out.println("\n\nIdades impares: ");
        for (int i = 0; i < idaImpar.length; i++) {
            somaImp += idaImpar[i];
            if (idaImpar[i] == 0) {
                i = idaImpar.length;
            } else {
                System.out.print(idaImpar[i] + " ");
            }
        }
        mediaPar = (double) somaPar / contIdaPar;
        mediaImp = (double) somaImp / contIdaImp;

        System.out.println("\n\nMedia dos numeros pares: " + mediaPar);
        System.out.println("Media dos numeros impares: " + mediaImp);

        System.out.print("\nIdades menores que a média dos valores do vetor impar:\n");
        int cont = 0;
        for (int i = 0; i < idaAlunos.length; i++) {
            if (idaAlunos[i] < mediaImp) {
                IDMENMENI[cont] = idaAlunos[i];
                System.out.print(IDMENMENI[cont]  + " ");
                cont++;
            }
        }
        System.out.println("\n\nIdades maiores que a média dos valores do vetor par:");
        cont = 0;
        for (int i = 0; i < idaAlunos.length; i++) {
            if (idaAlunos[i] > mediaImp) {
                IDMAIMEDP[cont] = idaAlunos[i];
                System.out.print(IDMAIMEDP[cont] + " ");
                cont++;
            }
        }
        cont = 0;
    }
}

