package ListaExercicios5_ForLoop;

import java.util.Scanner;

/*
02 - Elabore um programa em JAVA para controlar os pedidos de uma pizzaria. O usuário
deverá informar a quantidade de pizzas e a quantidade de refrigerantes. Cada pizza custa
R$ 40,00 e cada refrigerante R$ 8,00. Ao final, informe o valor pago pelo cliente.
*/
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantas pizzas? ");
        int qPiz = sc.nextInt();
        sc.nextLine();
        System.out.println("quantos refris? ");
        int qRef = sc.nextInt();
        sc.nextLine();
        System.out.println("preço: " + ((qPiz * 40) + (qRef * 8)));
    }
}
