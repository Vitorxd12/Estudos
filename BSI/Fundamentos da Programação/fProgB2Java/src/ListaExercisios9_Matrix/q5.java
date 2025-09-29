package ListaExercisios9_Matrix;

import java.util.Random;

/*
05 - Gere uma matriz 20x7 que representa a quantidade de produtos vendidos (0 a 100) de 20
produtos em uma determinada semana (cada coluna representa um dia na semana (0 –
domingo, 1 – segunda, .....)). A seguir, informe:
- o produto com mais venda na semana;
- o produto com mais venda no fim de semana (sábado e domingo);
- adicione em um vetor V as vendas dos produtos de segunda à quarta (3 dias
acumulados);
*/
public class q5 {
    public static void main(String[] args) {
        int nProdutos = 20, recordeVendas = 0, produtoMaisVendido = 0, produtoMaisVendidoFDS = 0, recordeVendasFDS = 0;
        int[][] mVendasSemanais = new int[nProdutos][7];
        int[] vSoma = new int[nProdutos];
        int[] vSomaFDS = new int[nProdutos];
        int[] vSegaQua = new int[nProdutos];
        Random rand = new Random();
        //i = produto
        //j = dia
        System.out.println("       Dia: |  1 | 2 | 3 | 4 | 5 | 6 | 7  |");

        //Loop do produto
        for (int i = 0; i < nProdutos; i++) {
            //Formatação da impressão
            System.out.print("Produto ");
            if (i < 9) {
                System.out.print("0");
            }
            System.out.print(i + 1 + ": |");

            //Loop da semana
            for (int j = 0; j < 7; j++) {
                mVendasSemanais[i][j] = rand.nextInt(101);
                System.out.printf("% 4d", mVendasSemanais[i][j], "  ");
                //Vendas da semana para o produto i
                vSoma[i] += mVendasSemanais[i][j];
                //Vendas ddo fim de semana para o produto i
                if (j == 0 || j == 6) {
                    vSomaFDS[i] += mVendasSemanais[i][j];
                }
                if (j == 2 || j == 3 || j == 4) {
                    vSegaQua[i] += mVendasSemanais[i][j];
                }
            }
            //Impressão de resultados
            System.out.print(" |  Vendas da semana: " + vSoma[i] + "\t");
            System.out.println("Vendas no fim de semana: " + vSomaFDS[i] + "\t");
        }
        //Produto mais vendido
        for (int i = 0; i < vSoma.length; i++) {
            if (vSoma[i] > recordeVendas) {
                recordeVendas = vSoma[i];
                produtoMaisVendido = i + 1;
            }
        }
        System.out.println("             -----------------------------");
        System.out.println("\nProduto que mais vendeu foi o produto " + produtoMaisVendido + " com " + recordeVendas + " unidades vendidas");

        //Produto mais vendido do fim de semana
        for (int i = 0; i < vSomaFDS.length; i++) {
            if (vSomaFDS[i] > recordeVendasFDS) {
                recordeVendasFDS = vSomaFDS[i];
                produtoMaisVendidoFDS = i + 1;
            }
        }
        System.out.println("Produto que mais vendeu no fim de semana foi o produto " + produtoMaisVendidoFDS + " com " + recordeVendasFDS + " unidades vendidas");

        //Vendas de segunda a quarta para cada respectivo produto
        System.out.println("\n\nVendas de segunda a quarta para cada respectivo produto: ");
        for (int i = 0; i < vSegaQua.length; i++) {
            System.out.print(" | Produto "+ (i+1) + ": " + vSegaQua[i]);
        }
    }
}