package ListaExercicios4_ForLoop;

import java.util.Scanner;

public class ExerciciosEmAula2 {
    public static void main(String[] args) {
        double base, altura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do retangulo: ");
        base = scanner.nextInt();
        System.out.println("Digite a altura do retangulo: ");
        altura = scanner.nextInt();

        System.out.println("Área do retangulo: " + base*altura);
        System.out.println("Perimetro do retangulo: " + (base * 2 + altura * 2));

    }
}
