package ListaExercicios6;

import java.util.Scanner;

/*03 - Elabore um programa para controlar os treinos de 20 clientes de uma academia. Para cada cliente
foi perguntado: dia do treino (1- Domingo, 2 – Segunda, ....) e o tipo do treino (P – Posterior, I –
Inferior, A - Ambos). Ao final, informe:
- Percentual de pessoas treinaram no fim de semana;
- Percentual de pessoas que treinaram de Segunda a Quarta somente posterior;
- Percentual de pessoas que treinaram de Segunda a Sexta somente inferior;*/
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCli = 4;
        int dia = 0, pTreinFDS = 0, pTreinSAQPost = 0, pTreinSASInf = 0;
        String treino;

        for (int i = 0; i < nCli; i++) {
            System.out.println("Vc treinou que dia da semana? (1- Domingo, 2 – Segunda, ....)");
            dia = sc.nextInt();
            sc.nextLine();
            System.out.println("Você treina o que? (P – Posterior, I – Inferior, A - Ambos)");
            treino = sc.nextLine().toUpperCase();
            System.out.println("\n");

            if ((dia == 1) || (dia == 7)) {pTreinFDS++;}
            if ((dia > 1) && (dia < 4) && (treino.equals("P"))) {pTreinSAQPost++;}
            if ((dia > 1) && (dia < 7) && (treino.equals("I"))) {pTreinSASInf++;}
        }
        System.out.println("\nPessoas que treinam fim de semana: " + pTreinFDS + "\n Pessoas que treinam somente posteriores de segunda a quarta: " + pTreinSAQPost + "\nPessoas que treinam somente inferiores de segunda a sexta: " + pTreinSASInf);
    }
}
