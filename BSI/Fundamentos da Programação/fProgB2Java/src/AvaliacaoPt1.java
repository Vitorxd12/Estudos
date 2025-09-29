/*Elabore um progama para gerar e armazenar em um vetor (vMes) o melhor tempo (em segundos com 2 casa decimais ) obtido
por um atleta nas provas dos 100m livres de natação em cada Mês do ano de 2024. o tempo a ser gerado deve ser entre
45.00 e 48.99 segundos. Considerando que o recorde mundial desta prova é 46,20 e o recorde pessoal do atleta é de 47.20,
crie um progama para:

* 1- infrmar qual o melhor mes em termos de desempenho indicando se houve RM ou RP (checar exemplo)

* 2- infromar a media de tempo obtido em cada quadrimestr (4 meses)

* 3 - adicionar em um vetor vBim o melor tempo de cada bimestre, imprimir o vetor vBim

* 4 - adicionar em um vetor vMeta a meta do temo mensal para 2025, considerando
*   - uma redução de 4% nos tempos dos meses do primeiro semestre]
*   - uma redução de 7 % nos tempos dos meses do segundo semestre
*   - imprimir o vetor vMeta*/

import java.util.Random;

public class AvaliacaoPt1 {
    public static void main(String[] args) {
        //Inicialização de variaveis
        Random rand = new Random();
        double[] vMes = new double[12];
        double[] vMeta = new double[12];
        double[] vBim = new double[6];
        boolean fimDeBimestre = false;
        double recorde = 0, somQuad1 = 0, somQuad2 = 0, somQuad3 = 0;
        int mesRecorde = 0, c = 0;
        System.out.println();


        for (int i = 0; i < vMes.length; i++) {
            //Gerar tempos dos meses
            vMes[i] = rand.nextInt(399) + 4500;
            vMes[i] = vMes[i] / 100;
            //Media dos quadrimestes
            if (i <= 3) {
                somQuad1 += vMes[i];
            } else if (i < 8) {
                somQuad2 += vMes[i];
            } else {
                somQuad3 += vMes[i];
            }
            System.out.print(" Mês " + (i + 1) + ": " + vMes[i] + " |");


            //Checar recordes
            if (vMes[i] < recorde || i == 0) {
                recorde = vMes[i];
                mesRecorde = i + 1;
            }
        }
        System.out.println("\n\nO melhor tempo do atleta foi no mês " + mesRecorde + " com " + recorde + " segundos. ");
        if (recorde < 46.20) {
            System.out.println("\nO atelta superou o recorde mundial de 46.20 segundos!");
        } else if (recorde > 46.20 && recorde < 47.20) {
            System.out.println(("\nO atleta superou seu recorde pessoal de 47.20 segundos!"));
        }
        System.out.println("\nA media dos tempos no quadrimestre 1 foi: " + String.format("%.2f",somQuad1 / 4));
        System.out.println("A media dos tempos no quadrimestre 2 foi: " + String.format("%.2f",somQuad2 / 4));
        System.out.println("A media dos tempos no quadrimestre 3 foi: " + String.format("%.2f",somQuad3 / 4));


        System.out.println("\nMetas para ano que vem: ");
        for (int i = 0; i < vMeta.length; i++) {
            if (i <= 5) {
                vMeta[i] = vMes[i] * 0.96;
            } else{
                vMeta[i] = vMes[i] * 0.93;
            }
            System.out.print(" Mês " + (i + 1) + ": " + String.format("%.2f", vMeta[i]) + " |");
        }

        for (int i = 1; i < vMes.length; i += 2) {
            // Armazena o menor valor do bimestre
            vBim[i / 2] = Math.min(vMes[i], vMes[i - 1]);
        }
        System.out.println("\n\nMelhor tempo de cada bimestre: ");
        for (int i = 0; i < vBim.length; i++) {
            System.out.print(" Bimestre " + (i + 1) + ": " + String.format("%.2f", vBim[i]) + " |");
        }

    }
}
