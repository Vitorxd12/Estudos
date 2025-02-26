package ListaExercisios9;

//02 - Leia uma matriz 4x4 e informe a quantidade de elementos abaixo da diagonal secundária acima de 10.

import java.util.ArrayList;
import java.util.Random;

public class q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int mSize = 5;
        int c = 0;
        int[][] matrix = new int[mSize][mSize];
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 0; i < mSize; i++) {
            for (int j = 0; j < mSize; j++) {
                matrix[i][j] = rand.nextInt(20);
                if (matrix[i][j] < 10) System.out.print("0");
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Números abaixo da diagonal secundaria: ");
        for (int i = 1; i < mSize; i++) {
            for (int j = mSize - 1; j >= mSize - i; j--) {
                System.out.print(matrix[i][j] + "  ");
                if (matrix[i][j] > 10) {
                    lista.add(matrix[i][j]);
                    c++;
                }
            }
            System.out.println();
        }
        System.out.println("Quantidade de numeros acima de 10 abaoixo da diagonal secundaria: " + lista.size());
    }
}

