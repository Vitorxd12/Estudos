package ListaExercicios4_ForLoop;

import java.util.Scanner;

public class ExerciciosEmAula3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc, tf = 0;
        System.out.println("Digite a temperatura em celsius: ");
        tc = scanner.nextInt();
        tf = (9 * tc + 160) / 5;
        System.out.println("Esta temperatura em fahrenheit: " + tf);
    }
}
