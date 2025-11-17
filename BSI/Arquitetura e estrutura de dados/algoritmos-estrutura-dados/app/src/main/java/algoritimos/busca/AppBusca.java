package algoritimos.busca;

import java.util.Arrays;
import java.util.Scanner;

public class AppBusca {
    public static void mostrarResultado(int posicao, int valor){
        if (posicao >= 0) {
            System.out.printf("Valor %d Encontrado na posição %d: \n", valor, posicao);
        } else {
            System.out.println("Não encontrado");
        }
    }


    public static void main(String[] args) {

        int valor = 4;
        int[] dados = {7, 3, 9, 1, 4, 5, 8, 2};
        int[] vetorOrdenado = BuscaBinaria.ordenar(dados);
        int posicao = -1;

        System.out.println("Array: " + Arrays.toString(dados));

        //Busca Sequencial
        System.out.println("Busca Sequencial:");
        posicao = BuscaSequencial.buscaSequencial(dados, valor);
        mostrarResultado(posicao, valor);

        //Busca Binária Iterativa
        System.out.println("Busca Binária Iterativa:");
        posicao = BuscaBinaria.buscaBinariaIterativa(vetorOrdenado, valor, 0, dados.length - 1);
        mostrarResultado(posicao, valor);

        //Busca Binária Recursiva
        System.out.println("Busca Binária Recursiva:");
        posicao = BuscaBinaria.buscaBinariaRecursiva(vetorOrdenado, valor, 0, dados.length - 1);
        mostrarResultado(posicao, valor);

    }

}