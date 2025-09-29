package ListaExercicos8_Vectors;

import java.util.Random;

/*
02 - Em uma viagem de Lagarto/Recife/Lagarto existem 10 radares que captam a velocidade instantânea
dos veículos. Considerando a velocidade máxima de 80 km/h neste percurso, elabore um programa para
gerar e armazenar em dois vetores 10 velocidades registradas por um carro tanto na IDA (vetor 1) quanto
na VOLTA (vetor 2). Considerações:

01 - As velocidades geradas devem ser entre 60 km/h e 140 km/h;
02 - Informe a quantidade de vezes que o carro teve a mesma velocidade em radares consecutivos na
viagem de ida (vetor 1);
03 - Informe o total de multas a ser paga pelo motorista do carro na viagem de IDA (vetor 1), considerando
que a multa para excessos de velocidades até 20% custa R$ 100,00 e excessos acima de 20% custa R$
300,00;
        04 - Em quais radares houve o registro da mesma velocidade (IDA e VOLTA);

Exemplo:
Velocidades do carro na IDA: 60 60 120 70 120 100 90 80 70 100
Velocidades do carro na VOLTA: 80 90 60 100 100 60 60 120 100 120
Número de Velocidades Iguais Consecutivas na IDA: 1 Vez(es)
Total de Multas (R$) na IDA: R$ 1300.00
Radares com Velocidades Iguais: 3, 6 (destacados em amarelo e vermelho)
*/
public class q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int nRadares = 10;
        int[] radarIda = new int[nRadares];
        int[] radarVolta = new int[nRadares];
        int[] radarVelIgual = new int[nRadares];

        int velConsec = 0;
        int totalMultasIda = 0;
        int contRadarVelIgual = 0;

        System.out.print("Velocidades na ida: ");
        for (int i = 0; i < radarIda.length; i++) {
            //Gerador de velocidades do radar de ida
            radarIda[i] = rand.nextInt(60) + 60;
            System.out.print(" " + radarIda[i]);

            // Checar velocidades repetidas consecutivas
            if (i > 0 && (radarIda[i] == radarIda[i - 1])) {
                velConsec++;
                System.out.print("<- Velocidade consecutiva! ");
            }
            // Aplicação de multas
            if ((radarIda[i] > 80) && (radarIda[i] <= 96)){
                totalMultasIda += 100;
            } else if (radarIda[i] > 96){
                totalMultasIda += 300;
            }
        }

        System.out.print("\nVelocidades na volta: ");
        for (int i = radarVolta.length - 1; i >= 0; i--) {
            // Gerador de velocidades do radar de volta
            radarVolta[i] = rand.nextInt(60) + 60;
            System.out.print(" " + radarVolta[i]);

            //Checar se foi igual ao de ida:
            if (radarVolta[i] == radarIda[i]){
                radarVelIgual[contRadarVelIgual] = i;
                System.out.print(" Igual!");
                contRadarVelIgual++;
            }
        }
        if (velConsec > 0) {
            System.out.println("\n\nNúmero de Velocidades Iguais Consecutivas na IDA: " + velConsec + " Vez(es)");
        }
        System.out.println("\nTotal de Multas (R$) na IDA: R$" + totalMultasIda);

        System.out.print("Radares nos qual a velocidade foi igual, na ida e na volta: ");
        for (int i = 0; i < contRadarVelIgual; i++) {
            System.out.print(radarVelIgual[i] + 1);
            if (i == contRadarVelIgual - 1) {
                System.out.print(". ");
            } else {
                System.out.print(", ");
            }
        }
    }
}