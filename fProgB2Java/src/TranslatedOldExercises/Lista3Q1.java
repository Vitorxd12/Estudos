package TranslatedOldExercises;

import java.util.Scanner;

//01 - Desenvolver um programa que leia a altura de um conjunto de pessoas.
//Este programa deverá calcular e mostrar: o percentual de pessoas com altura
//menor ou igual 1.70 e o percentual com altura maior que 1.70. Finalize a
//leitura de dados com uma altura negativa.

public class Lista3Q1 {
    public static void main(String[] args) {

        int altura = 0;
        int maior = 0;
        int cont = 0;
        Scanner scanner = new Scanner(System.in);

        while (altura >= 0) {
            System.out.println("Qual a sua altura, em centimetros?");
            altura = scanner.nextInt();
            scanner.nextLine();
            if (altura > 170){
                maior++;
            }
            cont++;
        }
        cont--;
        double percMaior = (maior * 100) / cont ;
        double percMenor = 100 - percMaior;
        System.out.println("O percentual de pessoas maiores que 1.70 é" + percMaior + "%");
        System.out.println("O percentual de pessoas menores que 1.70 é" + percMenor + "%");
    }
}
