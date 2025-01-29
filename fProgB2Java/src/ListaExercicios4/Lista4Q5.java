package ListaExercicios4;
import java.util.Random;

/*
05 -
Elabore um programa que preencha aleatoriamente um vetor de 1000 elementos inteiros no intervalo de 0 a 20.
Em seguida, informe o número de ocorrências de cada um dos casos possíveis.
Exemplo:

0 ocorreu 31 vezes
1 ocorreu 214 vezes
....
20 ocorreu 79 vezes.
*/
public class Lista4Q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[100];
        int[] count = new int[21];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(count.length);
            count[nums[i]]++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(i + " ocorreu " + count[i] + " vezes");
        }
    }
}

//well, that was easy
