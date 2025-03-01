package ListaExercicios5_ForLoop;

import java.util.Scanner;

/*
4 - Elabore um programa para ler 5 frutas. A seguir, informe:
- total de frutas que começa com a letra A ou B;
- total de frutas que termine com a letra A ou U;
- total de frutas que possuem o número de caracteres ímpar;
Exemplo: CAJU, BANANA, UVA, ACEROLA, MORANGO
Iniciam com A/B: 2
Terminam com A/U: 4
Número de caracteres. ímpar: 3
*/

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vFrutas = new String[5];
        int fruIniAB = 0;
        int fruTerAU = 0;
        int fruLenImp = 0;

        for (int i = 0; i < vFrutas.length; i++) {
            System.out.println("Digite o nome de uma fruta: ");
            vFrutas[i] = sc.nextLine().toUpperCase();
            if (vFrutas[i].length() % 2 != 0) {
                fruLenImp++;
            }
            if ((vFrutas[i].charAt(0) == 'A') || (vFrutas[i].charAt(0) == 'B')) {
                fruIniAB++;
            }
            if ((vFrutas[i].charAt(vFrutas[i].length() - 1) == 'A') || (vFrutas[i].charAt(vFrutas[i].length() - 1) == 'U')) {
                fruTerAU++;
            }
        }
        System.out.println("Frutas q iniciam com A ou B: " + fruIniAB + "\nFrutas que terminam com A ou U: " + fruTerAU + "\nNumero de caracteres impares: " + fruLenImp    );

    }
}
