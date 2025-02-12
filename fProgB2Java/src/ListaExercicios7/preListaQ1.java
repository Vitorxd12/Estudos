package ListaExercicios7;

import java.util.Random;

/*
1 - Crle um programa para gerar diversos numeros (ate 20).
Encerre a entrada de dados quando o nimero 10 for gerado.
Ao final, informe:

- a soma do maior nimero gerado com o menor nimero gerado;
- percentual de nimeros gerados abaixo de 5;

Exemplo:
05 09 03 13 19 12 05 04 10
Soma 119 +03 = 22
Percentual: 2/8 = 25%
*/
public class preListaQ1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numeros = new int[10];
        int maiorNum = 0;
        int menorNum = 0;
        int contNumMenor5 = 0;
        int i = 0;

        while (numeros[i] != 10 && numeros.length - 1 > i){
            i++;
            numeros[i] = rand.nextInt(100); System.out.println(numeros[i]);
            if (numeros[i] > maiorNum) {
                maiorNum = numeros[i];
                System.out.println("maior");
            }
            if ((numeros[i] < menorNum) || (i == 1)) {
                menorNum = numeros[i];
                System.out.println("menor");
            }
            if (numeros[i] < 5) {
                contNumMenor5++;
                System.out.println("numero abaixo de 5");
            }
        }
        System.out.println("Menor numero: " + menorNum);
        System.out.println("Maior numero: " + maiorNum);
        System.out.println("Percentual de numeros menores que 5: " + contNumMenor5);
    }
}
