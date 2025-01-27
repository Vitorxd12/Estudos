package TranslatedOldExercises;
import java.util.Scanner;

/*02 - Construa um programa que leia um número entre 1000 e 9999. A seguir, adicione em um
vetor V o algarismo que representa a quantidade de unidade de milhar, centena, dezena e
unidades. */
public class Lista4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] res = new int[4];

            System.out.println("Digite um numero de 4 dígitos: ");
            int num = sc.nextInt();
            sc.nextLine();

            res[3] = num % 10; //Unidade
            res[2] = ((num % 100) - (num % 10)) / 10; //Dezena
            res[1] = ((num % 1000) - (num % 100)) / 100; //Centena
            res[0] = num / 1000; //Milhar

            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i]);
        }
    }
}

