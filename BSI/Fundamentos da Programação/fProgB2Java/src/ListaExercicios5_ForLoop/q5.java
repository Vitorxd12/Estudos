import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nmAlu = 3;
        String[] disci = new String[nmAlu];
        String[] perio = new String[nmAlu];
        String[] lingu = new String[nmAlu];
        double pDisc = 0, pPeri = 0, pLing = 0;

        for (int i = 0; i < nmAlu; i++) {
            System.out.println("Qual a disciplna do curso de SI que vc ta cursando? (FP, MD, IC)");
            disci[i] = sc.nextLine().toUpperCase();
            if (disci[i].equals("FP")) {
                pDisc++;
            }

            System.out.println("Qual o melhor periodo do seu curso? ");
            perio[i] = sc.nextLine().toUpperCase();
            if ((perio[i].equals("1") || perio.equals("2"))) {
                pPeri++;
            }

            System.out.println("Qual sua linguagem favorita? (J - Java; P - Python; O - Outras)");
            lingu[i] = sc.nextLine().toUpperCase();
            if (!lingu[i].equals("J")) {
                pLing++;
            }
        }
        System.out.println("Disciplina - Periodo - Linguagem");
        for (int i = 0; i < nmAlu; i++) {
            System.out.println("    " + disci[i] + "    -    " + perio[i] + "    -    " + lingu[i]);
        }
        System.out.println("Percentual das pessoas que gostaram mais da materia de Fundamentos da progamação: " + (pDisc * 100 / nmAlu));
        System.out.println("Percentual das pessoas que gostaram mais do primeiro ou segundo periodo: " + (pPeri * 100 / nmAlu));
        System.out.println("Percentual de pessoas que odeiam java: " + (pLing * 100 / nmAlu));
    }
}