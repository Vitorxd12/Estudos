package ListaExercisios9_Matrix;

import java.util.Random;

/*
03 - Elabore um programa que gere uma matriz 4x4. Os números devem ser gerados no
intervalo de 0 a 20. A seguir, informe:
        - média dos elementos da matriz abaixo de 5;
        - adicione em um Vetor V, os elementos da matriz acima da média;
        */
public class q3 {
    public static void main (String[] args) {
        int mSize = 4, c = 0;
        double soma = 0, media = 0;
        int[][] matrix = new int[mSize][mSize];
        int[] vetor = new int[mSize*mSize];
        Random rand = new Random();
        for (int i = 0; i < mSize; i++) {
            for (int j = 0; j < mSize; j++) {
                matrix[i][j] = rand.nextInt(21);
                soma += matrix[i][j];
                System.out.printf("% 3d", matrix[i][j]);
            }
            System.out.println();
        }
        media = soma / (mSize * mSize);
        System.out.println("Média: " + media);
        System.out.println("Números acima da média:");
        for (int i = 0; i < mSize; i++) {
            for (int j = 0; j < mSize; j++) {
                if (matrix[i][j] > media) {
                    vetor[c] = matrix[i][j];
                    System.out.print(vetor[c] + " ");
                    c++;
                }
            }
        }
    }
}
