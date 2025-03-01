package ListaExercicios4_ForLoop;
import java.util.Random;

/*04 - Leia a idade de 10 alunos e armazene em um vetor V. A seguir, crie 04 vetores:
- adicione em um vetor P as idades pares;
- adicione em um vetor I as idades ímpares;
- adicione em um vetor AP as idades maiores que 18 anos a partir do vetor P;
- adicione em um vetor AI as idades maiores que 18 anos a partir do vetor I;
Exemplo:

Vetor V 12, 19, 23, 16, 26, 30, 21, 17, 15, 29
Vetor P 12, 16, 26, 30 Vetor I 19, 23, 21, 17, 15, 29
Vetor AP 26, 30 Vetor AI 19, 23, 21, 29*/

public class Lista4Q4 {
    public static void main (String[] args){

        Random rand = new Random();

        int[] idaAlu = new int[10];
        int[] idaPar = new int[idaAlu.length];
        int[] idaImp = new int[idaAlu.length];
        int contPar = 0;
        int contImp = 0;
        int[] parDeMaior = new int[idaAlu.length];
        int[] impDeMaior = new int[idaAlu.length];
        int contParMaior = 0;
        int contImpMaior = 0;

        System.out.println("Idade dos alunos:");
        for (int i = 0; i < idaAlu.length; i++) {
            idaAlu[i] = rand.nextInt(30) + 1;
            System.out.print("  " + idaAlu[i]);

            if (idaAlu[i] % 2 == 0){
                idaPar[contPar] = idaAlu[i];
                contPar++;
                if (idaAlu[i] > 18){
                    parDeMaior[contParMaior] = idaAlu[i];
                    contParMaior++;
                }
            }
            else {
                idaImp[contImp] = idaAlu[i];
                contImp++;
                if (idaAlu[i] > 18){
                    impDeMaior[contImpMaior] = idaAlu[i];
                    contImpMaior++;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Idades impares:");
        for (int i = 0; ((i < idaAlu.length) && (idaImp[i] > 0)); i++) {
            System.out.print("  " + idaImp[i]);
        }

        System.out.println();
        System.out.println("Idades pares:");
        for (int i = 0; ((i < idaAlu.length) && (idaPar[i] > 0)); i++) {
            System.out.print("  " + idaPar[i]);
        }

        System.out.println();
        System.out.println("Idades impares, maiores que 18:");
        for (int i = 0; ((i < idaAlu.length) && (impDeMaior[i] > 0)); i++) {
            System.out.print("  " + impDeMaior[i]);
        }

        System.out.println();
        System.out.println("Idades pares, maiores que 18:");
        for (int i = 0; ((i < idaAlu.length) && (parDeMaior[i] > 0)); i++) {
            System.out.print("  " + parDeMaior[i]);
        }

        }
    }

