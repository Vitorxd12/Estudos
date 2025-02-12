package ListaExercicios7;
/*
 01 - Desenvolver um programa que leia a idade de um conjunto de pessoas. Este programa
deverá calcular e mostrar: o percentual de pessoas adultas (&gt;=18) e o percentual de pessoas
idosas (&gt;=65). Finalize a leitura de dados com uma idade negativa.
*/

import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        double idade = 0, repet = 0, nIdos = 0, nAdul = 0;
        Scanner sc = new Scanner(System.in);

        while(idade >= 0){
            System.out.println("Qual a idade do individuo? (Digite uma idade negativa para encerrar o progama.) ");
            idade = sc.nextDouble();
            sc.nextLine();
            if (idade >= 18 && idade < 65 ) nAdul++;
            if (idade >= 65) nIdos++;
            if (!(idade < 0)) repet++;
        }
        System.out.println("Fim do progama. Número de pessoas: " + repet);
        System.out.println("Percentual de Idosos: " + nIdos * 100 / repet);
        System.out.println("Percentual de Adulos: " + nAdul * 100 / repet);
        System.out.println("Percentual de Crianças: " + (repet - nIdos - nAdul) * 100 / repet);
    }
}
