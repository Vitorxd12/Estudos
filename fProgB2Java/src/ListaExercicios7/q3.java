package ListaExercicios7;

import java.util.Scanner;

/*
03 - Em formato de menu, crie um programa para escolher uma figura geométrica plana (R, C,
 Q) e calcular a área e o perímetro da figura escolhida. Ao escolher o retângulo (R), o usuário
deve informar o lado e altura. Ao escolher o círculo (C), o usuário deve informar o raio. Ao
escolher quadrado (Q), o usuário deve escolher o lado. O sistema deve ser encerrado quando
escolher a figura “Z”.
 */
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado = 0, altura = 0, raio = 0, area = 0, peri = 0;
        String fig;
        System.out.println("Escolha uma figura (R - Retângulo, C - Círculo, Q - Quadrado) ou Digite Z para sair");
        fig = sc.nextLine();

        while (!fig.equalsIgnoreCase("z")){
            if (fig.equalsIgnoreCase("r")){
                System.out.println("Digite o lado do retangulo:");
                lado = sc.nextInt();
                System.out.println("Digite o altura do retangulo:");
                altura = sc.nextInt();
                System.out.println("A área do retângulo é " + lado * altura);
                System.out.println("O perimetro do retângulo é " + ((lado * 2 ) + (altura * 2)));
            }

            else if (fig.equalsIgnoreCase("c")){
                System.out.println("Digite o raio do circulo:");
                raio = sc.nextInt();
                System.out.println("A área do circulo é ~" + 3 * raio * raio);
                System.out.println("O perimetro do circulo é ~" + 2 * 3 * raio);
            }
            else if (fig.equalsIgnoreCase("q")){
                System.out.println("Digite o lado do quadrado:");
                lado = sc.nextInt();
                System.out.println("A área do quadrado é " + lado * lado);
                System.out.println("O perimetro do quadrado é " + lado * 4);
            }
            sc.nextLine();
            System.out.println("Escolha uma figura (R - Retângulo, C - Círculo, Q - Quadrado) ou Digite Z para sair");
            fig = sc.nextLine();
        }
        System.out.println("Fim da programa");
        sc.close();
    }
}
