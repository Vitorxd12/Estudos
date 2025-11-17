package algoritimos.busca;

public class BuscaBinaria {


    //Insertion sort
    public static int[] ordenar(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int chave = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > chave) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = chave;
        }
        return arr;
    }

    // Versão Iterativa

    public static int buscaBinariaIterativa(int[] vetor, int valor, int inicio, int fim) {
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    // Versão Recursiva

    public static int buscaBinariaRecursiva(int[] vetor, int valor, int inicio, int fim) {
        if (inicio > fim){
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (vetor[meio] == valor){
            return meio;
        } else if(vetor[meio] > valor){
            return buscaBinariaRecursiva(vetor, valor, inicio, meio-1);
        } else if (vetor[meio] < valor){
            return buscaBinariaRecursiva(vetor, valor, meio+1, fim);
        }
        return -1;
    }

}