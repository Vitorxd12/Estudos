package Aula_0_Preparatorio.ListasPortugolTraduzidas;
import java.util.Random;

/*
03 - Ler um vetor M com as médias finais de uma turma de 8 alunos. A seguir, calcule a média
aritmética dos alunos aprovados (média maior ou igual a 6). Armazene em um vetor A, os índices
que cada aluno ocupa no vetor M dos alunos que obtiveram média maior ou igual que a média da
turma.
*/

public class Lista4Q3 {
    public static void main(String[] args){
        Random random = new Random();
        
        double[] m = new double[8];
        int[] a = new int[m.length];
        
        int c = 0;
        double somaNotAp = 0;
        double numAluAp = 0;

        for (int i = 0; i < m.length; i++){
            m[i] = random.nextInt(100);
            m[i] = m[i] / 10;
            System.out.print("  " + m[i]);
            if (m[i] > 6){
                System.out.print("*");
                numAluAp++;
                somaNotAp = somaNotAp + m[i];
                a[c] = i;
                c++;
            }
        }
        System.out.println();
        System.out.println("Número de alunos aprovados: " + numAluAp);
        System.out.println("Média dos alunos aprovados: " + somaNotAp/numAluAp);
        for (int i = 0; i < a.length; i++){
            if ((i > 0) && (a[i] == 0)){
                i = 10;
            } else {
                System.out.print("  " + a[i]);
            }
        }
    }
}
