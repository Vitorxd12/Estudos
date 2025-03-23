package ListaExercisios9_Matrix;

import javax.xml.transform.Source;
import java.util.Random;

/*
Elabore um programa para gerar e imprimir duas matrizes mVenda2022 e
mVenda2023 (4x4) com valores até 1000. As linhas representam a quantidade de
clientes que compraram em uma rede (4 lojas) de pastelaria na cidade de
Ressaquinha (MG). As colunas representam os primeiros meses do ano (Janeiro
a Abril). A seguir:
mVendas2022
200 400 600 500
100 900 800 300
700 800 200 900
400 100 600 700
mVendas2023
600 400 700 300
100 400 500 900
100 100 100 400
800 700 300 400

- crie e imprima o vetor vMaxMes2022 que conterá a maior quantidade de
cada mês de mVendas2022 (700, 900, 800, 900);
- crie e imprima o vetor vParImpar que conterá os elementos das linhas
pares e colunas ímpares (nesta ordem, observe o exemplo!) de mVendas2022
(200, 400, 600, 500, 700, 800, 200, 900, 400, 900, 800, 100, 500, 300, 900, 700);
- informe em qual loja em 2023 teve menos clientes (considere todos
meses);
- informe em qual(is) mês(es) a quantidade de clientes em 2023 teve um
crescimento acima de 10% comparado a 2022;
*/
public class q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int nLojas = 4;
        int nMeses = 4;
        int c = 0;
        int lojaMenosVendeu = 0;
        int[] vVendasPorMes2022 = new int[nMeses];
        int[] vVendasPorMes2023 = new int[nMeses];
        int[] vVendasPorLoja = new int[nLojas];
        int[] vParImpar = new int[nLojas * nMeses + 2];
        int[] vMaxMeses = new int[nMeses];
        int[][] mVendas2022 = new int[nLojas][nMeses];
        int[][] mVendas2023 = new int[nLojas][nMeses];

        //Loop principal Vendas 2022
        System.out.println("Vendas 2022");
        for (int i = 0; i < nLojas; i++) {
            for (int j = 0; j < nMeses; j++) {
                //Geração de valores
                mVendas2022[i][j] = rand.nextInt(9) * 100 + 100;
                System.out.printf("% 5d", mVendas2022[i][j]);
                //Soma das Vendas Por mês
                vVendasPorMes2022[j] += mVendas2022[i][j];
                //Valor mais alto de cada mês
                if (mVendas2022[i][j] > vMaxMeses[j]) {
                    vMaxMeses[j] = mVendas2022[i][j];
                }
                //vParImpar linhas - colunas serão calculadas no loop de 2023.
                if (i % 2 != 0) {
                    vParImpar[c] = mVendas2022[i][j];
                    c++;
                }
            }
            System.out.println();
        }

        //Loop principal Vendas 2023
        System.out.println("\nVendas 2023");
        for (int i = 0; i < nLojas; i++) {
            for (int j = 0; j < nMeses; j++) {
                //Geração de valores
                mVendas2023[i][j] = rand.nextInt(9) * 100 + 100;
                System.out.printf("% 5d", mVendas2023[i][j]);
                //Soma das vendas por loja
                vVendasPorLoja[i] += mVendas2023[i][j];
                //Soma das Vendas Por mês
                vVendasPorMes2023[j] += mVendas2023[i][j];
                //vParImpar - colunas
                if (j % 2 == 0) {
                    vParImpar[c] = mVendas2022[i][j];
                    c++;
                }
            }
            System.out.println();
        }
        System.out.println();
        //Calculo de acrescimo de clientes 10% por ano
        for (int i = 0; i < nMeses; i++) {
            if ((vVendasPorMes2023[i] * 100) / vVendasPorMes2022[i] > 110) {
                System.out.println("\nAumento de 10% no mês " + (i + 1));
                System.out.println("Vendas 2022 neste mês: " + vVendasPorMes2022[i]);
                System.out.println("Vendas 2023 no mesmo mês: " + vVendasPorMes2023[i]);
            }

        }

        System.out.println("\nValores mais altos de cada mês de 2022:");
        for (int i = 0; i < nMeses; i++) {
            System.out.printf("%5d", vMaxMeses[i]);
        }
        System.out.println("\n\nValores das colulas pares e linhas impares do ano de 2022:");
        for (int i = 0; i < vParImpar.length; i++) {
            System.out.printf("%5d", vParImpar[i]);
            //impede que apareçam 0 extras.
            if (vParImpar[i + 1] == 0){
                break;
            }
        }

        System.out.println("\n\nVendas de cada loja no ano de 2023:");
        for (int i = 0; i < nLojas; i++) {
            System.out.printf("%5d", vVendasPorLoja[i]);
        }

        System.out.println("\n\nLoja que menos vendeu no ano de 2023:");
        for (int i = 1; i < vVendasPorLoja.length; i++) {
            if (vVendasPorLoja[i] < vVendasPorLoja[lojaMenosVendeu]) {
                lojaMenosVendeu = i;
            }
        }
        System.out.printf("%5d",lojaMenosVendeu + 1);
    }
}
