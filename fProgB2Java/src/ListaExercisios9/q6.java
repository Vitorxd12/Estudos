package ListaExercisios9;

import java.util.Random;

/*
06 - Gere uma matriz 10x6 que representa o faturamento das lojas de uma empresa (10.000 a
20.000). Cada linha representa uma loja e cada coluna os últimos 6 meses (Jan a Jun). A seguir,
informe:
        - faturamento de cada trimestre de todas as lojas;
        - quais lojas com faturamento trimestral acima de 50.0000;
        - adicione uma nova matriz 10x3 com o faturamento por bimestre;
      */
public class q6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int nLojas = 10;
        int c = 0, ct1 = 0, ct2 = 0;
        int[] vTrim1 = new int[nLojas];
        int[] vTrim2 = new int[nLojas];
        int[] vSomaBim = new int[nLojas];
        int[] lojFatAltT1 = new int[nLojas];
        int[] lojFatAltT2 = new int[nLojas];
        int[][] mSemestre = new int[nLojas][6];
        int[][] mBimestre = new int[nLojas][3];
        System.out.println("    Mês:  Janei Ferei Março Abril Maio  Junho");
        //Geração das linhas da matriz (lojas)
        for (int i = 0; i < nLojas; i++) {
            System.out.print("Loja ");
            if (i < 9) {
                System.out.print("0");
            }
            System.out.print(i + 1 + ": ");
            //Geração das colunas da matriz (Meses)
            for (int j = 0; j < 6; j++) {
                mSemestre[i][j] = rand.nextInt(10000) + 10000;
                System.out.printf("% 5d", mSemestre[i][j]);
                //Soma do primeiro trimestre
                if (j < 3) {
                    vTrim1[i] += mSemestre[i][j];
                    //Checagem se trimestre foi acima de 50000
                    if (vTrim1[i] > 50000) {
                        lojFatAltT1[ct1] = i;
                        ct1++;
                    }
                } else {
                    vTrim2[i] += mSemestre[i][j];
                    if (vTrim2[i] > 50000) {
                        lojFatAltT2[ct2] = i;
                        ct2++;
                    }
                }
            }
            System.out.print("    Faturamento do trimestre 1: " + vTrim1[i] + "\t");
            System.out.print(" Faturamento do trimestre 2: " + vTrim2[i] + "\t");
            System.out.println();
        }
        System.out.print("\nLojas que tiveram um faturamento acima de 50000 primeiro trimestre: ");
        while (lojFatAltT1[c] != 0 || c == 0) {
            System.out.print(lojFatAltT1[c] + 1);
            c++;
            if (lojFatAltT1[c] != 0) {
                System.out.print(", ");
            } else {
                System.out.print(". ");
            }
        }
        c = 0;
        System.out.print("\nLojas que tiveram um faturamento acima de 50000 no segundo trimestre: ");
        while (lojFatAltT2[c] != 0 || c == 0) {
            System.out.print(lojFatAltT2[c] + 1);
            c++;
            if (lojFatAltT2[c] != 0) {
                System.out.print(", ");
            } else {
                System.out.print(". ");
            }
        }
        c = 0;
        System.out.println("\n\n      Bimestre 1  Bimestre 2  Bimestre 3");
        for (int i = 0; i < nLojas; i++) {
            System.out.print("Loja ");
            if (i < 9) {
                System.out.print("0");
            }
            System.out.print(i + 1 + ": ");
            //começa o loop a partir do 1 para facilitar checagem se par
            for (int j = 1; j < 7; j++) {
                //se par
                if (j % 2 == 0){
                    //soma o atual com o anteior e guarda ele no indcie que um terço de j, ja que bimestre
                    mBimestre[i][j /3 ] += mSemestre[i][j - 1] + mSemestre[i][j - 2];
                    System.out.printf("% 9d", mBimestre[i][j / 3]);
                }
            }
            System.out.println();
        }
    }
}
