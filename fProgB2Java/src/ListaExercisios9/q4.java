package ListaExercisios9;

import java.util.Scanner;

/*
- adicione em um Vetor V, os elementos da matriz acima da média;
04 - Elabore um programa que leia uma Matriz M (4x3) que representa as 03 notas de 04 alunos
(cada linha representa um aluno e cada coluna representa uma nota). A seguir, adicione em
Vetor V, a média das notas de cada aluno.

*/
public class q4 {
    public static void main(String[] args) {
        int nAlunos = 4, nNotas = 3, soma = 0;
        int[][] matrix = new int[nAlunos][nNotas];
        int[] vetor = new int[nAlunos];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Digite as 3 notas do aluno " + (i + 1));
            for (int j = 0; j < nNotas; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                matrix[i][j] = sc.nextInt();
                soma += matrix[i][j];
            }
            vetor[i] = soma / nNotas;
            System.out.println("Média do aluno " + (i+1) + ": " +vetor[i]);
            soma = 0;
        }
        System.out.println("Medias dos alunos: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + vetor[i]);
        }
    }
}
