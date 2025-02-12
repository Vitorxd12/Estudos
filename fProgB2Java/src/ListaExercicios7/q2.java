package ListaExercicios7;

import java.util.Scanner;
/*
02 - Elabore um programa para controlar o esporte e time preferido de um conjunto de pessoas.
O programa deverá ler o esporte preferido (F - Futebol, V - Vôlei, B - Basquete), o time de
futebol sergipano preferido (SER, CON, LAG, ITA) e o sexo (F, M) do entrevistado. O programa
deverá ser encerrado com o esporte “Z”. A seguir, informe:
o percentual de preferência do futebol;
o percentual das mulheres que preferem vôlei e
o percentual de pessoas, dentre os que preferem futebol, que torcem pelo time “CON”.
*/

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String team, sex, sport;
        int nFut = 0, volFem = 0, nFutCon = 0, cont = 0;

        System.out.println("Qual o seu esporte favorito? (F - Futebol, V - Vôlei, B - Basquete, Z- Sair)");
        sport = sc.nextLine().toUpperCase();

        while(!sport.equals("Z")){
            System.out.println("Escolha um dentre os times de futebol sergipano. (SER, CON, LAG, ITA) ");
            team = sc.nextLine().toUpperCase();
            System.out.println("Qual o seu sexo? (F, M)");
            sex = sc.nextLine().toUpperCase();

            if(sport.equals("F")) nFut++;
            if(sport.equals("V") && sex.equals("F")) volFem++;
            if(sport.equals("F") && team.equals("CON")) nFutCon++;
            cont++;

            System.out.println("Qual o seu esporte favorito? (F - Futebol, V - Vôlei, B - Basquete, Z- Sair)");
            sport = sc.nextLine().toUpperCase();
        }

        System.out.println(nFut +" "+ volFem +" "+ nFutCon);
        System.out.println("Percentual de preferência do futebol: " + nFut * 100 / cont);
        System.out.println("Percentual das mulheres que preferem vôlei: " + volFem * 100 / cont);
        System.out.println("Percentual de pessoas, dentre os que preferem futebol, que torcem pelo time “CON”: " + nFutCon * 100 / nFut);
    }
}
