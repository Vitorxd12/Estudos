package PrimeiroProjeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Professor> prof = new ArrayList<Professor>();

        //Sempre que for criar um metodo novo de uma classe com metodo construtor, é necessario colocar parametros iniciais pois se não da erro.
        Aluno aluno_1 = new Aluno("Maria", 18);
        aluno_1.setMatricula(("b23456").toUpperCase());

        int menu = 1;
        while (menu == 1 || menu == 2) {
            System.out.println("Digite 1 para cadastrar um professor");
            System.out.println("Digite 2 para cadastrar a nota de um aluno");
            System.out.println("Digite 0 para sair");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.println("Digite o login do professor");
                String login = sc.nextLine();
                System.out.println("Digite a senha do professor");
                String senha = sc.nextLine();
                prof.add(new Professor(login, senha));
            }
            if (menu == 2) {
                System.out.println("Digite o login do professor");
                String login = sc.nextLine();
                System.out.println("Digite a senha do professor");
                String senha = sc.nextLine();
                System.out.println("Digite a nota do aluno");
                double nota = sc.nextDouble();
                sc.nextLine();
                try {
                    for (int i = 0; i < prof.size(); i++) {
                        boolean autenticado = prof.get(i).autenticar(login, senha);
                        if (autenticado) {
                            aluno_1.setNotaFinal(nota);
                            aluno_1.getStatus("senha123");
                            System.out.println("nota cadastrada");
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Erro ao autenticar o professor");
                }
            }
        }
    }
}