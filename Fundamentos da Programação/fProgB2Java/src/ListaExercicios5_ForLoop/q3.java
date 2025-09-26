package ListaExercicios5_ForLoop;

import java.util.Scanner;

/*
03 - Elabore um programa em JAVA para controlar os pedidos de uma pizzaria. O usuário
deverá informar a quantidade e o tamanho das pizzas. Cada pizza tamanho P custa R$
20,00, tamanho M custa R$ 30,00 e tamanho G custa R$ 40,00. Ao final, informe o valor
pago pelo cliente.
*/
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q;
        String t;

        System.out.println("Quantas pizzas?");
        q = sc.nextInt();
        sc.nextLine();
        System.out.println("tamanho das pizzas? ('P', 'M' ou 'G')");
        t = sc.nextLine().toUpperCase();
        switch (t) {
            case "P":
                System.out.println("Preço das pizzas: " + q * 20);
                break;
            case "M":
                System.out.println("Preço das pizzas: " + q * 30);
                break;
            case "G":
                System.out.println("Preço das pizzas: " + q * 40);
                break;
            default:
                System.out.println("Digite um tamanho válido para as pizzas.");
                break;
        }

    }
}
