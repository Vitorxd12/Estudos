package ListaExercicios4;

import java.util.Scanner;

//criou a classe com o memso nome do arquivo
public class ExerciciosEmAula1 {

    //criou o principal metodo da classe
    public static void main(String[] args){
        double[] notas = new double[3];
        double soma = 0;
        String nome;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextInt();
            soma += notas[i];
        } System.out.println("A média de " + nome + " é " + soma / notas.length);
    }
}
