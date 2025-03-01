package ListaExercisios9_Matrix;/*
Em uma viagem de Lagarto a Maceio existem 5 radares (3 em Sergipe e 2 em Alagoas) que captam a velocidade instantanez
dos veículos. Elabore um programa para gerar e armazenar em uma MATRIZ as velocidades (múltiplos de 10 até 140)
registradas por 10 carros (matriz 10 x 5). Após a leitura completa da matriz, solicito:

1 - informar a maior velocidade registrada do carro 5 (índice 4);
2 - informar o número de velocidades acima de 100 do radar 2 (índice 1);
3 - informar o número de velocidades acima de 100 em ALAGOAS;
4 - inclua em um vetor (vMedVelCar) a média de velocidade de cada CARRO
5 - inclua em um vetor (vPerCarRad) o percentual de carros com velocidade acima de 100 em cada RADAR;
6 - inclua em um vetor (vMedVelRad) a média de velocidade de cada RADAR (QUESTÃO EXTRA);
*/

import java.util.Random;

public class q7 {
    public static void main(String[] args) {
        int nRadares = 5, nCarros = 10;
        int vRecordeCarro5 = 0, nMultasRad2 = 0, nMultasAL = 0, somaCalcMedCar = 0;
        double[] vMedVelCar = new double[nCarros];
        double[] vPerCarRadar = new double[nRadares];
        double[] vMedVelRad = new double[nRadares];
        int[][] mVelRad = new int[nCarros][nRadares];
        Random rand = new Random();

        //loop  referente ao numero de linhas i
        System.out.println("   Radar: |  1  | 2  | 3  | 4  | 5  |");
        for (int i = 0; i < nCarros; i++) {

            //Algoritimo de escrever o nome da linha + o 0 se for necessário
            System.out.print("Carro ");
            if (i < 9) System.out.print("0");
            System.out.print(i + 1 + ": ");

            //loop referente ao numero de colunas j
            for (int j = 0; j < nRadares; j++) {
                mVelRad[i][j] = rand.nextInt(14) * 10;
                System.out.printf("% 5d", mVelRad[i][j]);

                //maior velocidade do carro 5
                if (i == 4 && mVelRad[i][j] > vRecordeCarro5){
                    vRecordeCarro5 = mVelRad[i][j];
                }
                //Multa no radar 2
                if (j == 1 && mVelRad[i][j] > 100){
                    nMultasRad2++;
                }
                //multas em alagoas
                if ((j == 3 || j == 4) && mVelRad[i][j] > 100){
                    nMultasAL++;
                }
                //Soma para calcular a velocidade media de cada carro
                somaCalcMedCar +=mVelRad[i][j];
                //contagem de carros acima de 100 em cada radar
                if (mVelRad[i][j] > 100){
                    vPerCarRadar[j]++;
                }
                //Soma da velocidade de cada radar
                vMedVelRad[j] += mVelRad[i][j];
            }

            //Velocidade media de cada carro
            vMedVelCar[i] = (double) somaCalcMedCar / nRadares;
            somaCalcMedCar = 0;
            System.out.println();
        }

        System.out.println();
        System.out.println("Maior velocidade gravada pelo carro 5: " + vRecordeCarro5);
        System.out.println("Número de multas radar 2: " + nMultasRad2);
        System.out.println("Número de multas em alagoas: " + nMultasAL);

        System.out.println("Velocidade media de cada carro:");
        for (int i = 0; i < vMedVelCar.length; i++) {
            System.out.print("Carro " + (i + 1) + ": " + String.format("%.2f", vMedVelCar[i]) + "\t");
        }

        System.out.println();
        System.out.println("Porcentagem de multas caputadas por radar");
        //Converter soma das multas dos radares em  porcentagens e imprimir
        for (int i = 0; i < vPerCarRadar.length; i++) {
            vPerCarRadar[i] = (vPerCarRadar[i] * 100) / nCarros;
            System.out.print("Radar " + (i + 1) + ": " + String.format("%.2f",vPerCarRadar[i]) + "%\t");
        }
        System.out.println();
        System.out.println("Velocidade media capturada por cada radar:");
        for (int i = 0; i < vMedVelRad.length; i++) {
            vMedVelRad[i] = vMedVelRad[i] / nCarros;
            System.out.print("Radar " + (i + 1) + ": " + String.format("%.2f",vMedVelRad[i]) + "\t");
        }
    }
}
