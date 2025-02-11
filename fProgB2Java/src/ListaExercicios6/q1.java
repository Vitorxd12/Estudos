package ListaExercicios6;

import java.util.Random;

public class q1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int carros = 101;
        int valMultaLeve = 100;
        int valMultaGrave = 200;
        int velocidade = 0, nMultaLeve = 0, nMultaGrave = 0, topSpeed = 0;

        for (int t = 0; t < 2; t++) {

            for (int i = 1; i < carros; i++) {
                velocidade = rand.nextInt(200);
                if (velocidade > 100) {
                    nMultaLeve++;
                }
                if (velocidade > 140) {
                    nMultaGrave++;
                }
                if ((velocidade > topSpeed) && (t == 1)) {
                    topSpeed = velocidade;
                }
            }
            if (t == 0) {
                System.out.println("Número de carros acima de 100km/h no turno matutino: " + nMultaLeve);
            } else if (t == 1) {
                System.out.println("Velocidade mais alta registrada no turno verspertino: " + topSpeed);
            }
        }
        System.out.println("Valor total arrecadado nos dois turnos: " + ((nMultaLeve * valMultaLeve) + (nMultaGrave * valMultaGrave)));
    }
}

/*
01 - Elabore um programa para gerar 100 números (até 200) que representam as velocidades
registradas por diversos carros em um radar na BR 101 próximo a cidade de Estância/SE. Considere os
50 valores iniciais no turno da manhã e os demais no turno da tarde. Ao final, informe:

- número de carros com velocidade acima de 100Km/h no turno da manhã;
- maior velocidade registrada no turno da tarde;
- total do valor que será arrecadado das multas dos carros nos dois turnos:
- velocidade entre 100 km/k e 140 km/h  multa de R$ 100,00
- velocidade acima de 140 km/h  multa de R$ 200,00
*/