package ListaExercisios9_Matrix;

import java.util.Scanner;

//01 - Leia uma matriz 3x3 e informe a soma dos elementos acima da diagonal principal.
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz ={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] vNumAciDia = new int[3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) {
                vNumAciDia[j] = matriz[i][j];
                System.out.print(vNumAciDia[j] + " ");
            }
            System.out.println();
        }
    }
}

/**/
