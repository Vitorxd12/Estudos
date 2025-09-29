package Lista1Q1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Texto regex - Várias datas
        String texto = "Hoje é dia 26/05/2025, e amanhã será 27/05/2025. O Maratitos vence em 31/12/2025, enquanto o Maratinho venceu em 15/01/2024. O Molho Gota vence em 29/05/2025., que será em menods de 7 dias.";
        System.out.println(ProdutoEstoque.extrairDatas(texto));


        //lista
        List<ProdutoEstoque> produtos = new ArrayList<>();
        produtos.add(new ProdutoEstoque("Maratitos", LocalDate.of(2025, 12, 31), 50));// não vencido
        produtos.add(new ProdutoEstoque("Maratinho", LocalDate.of(2024, 1, 15), 30));// vencido
        produtos.add(new ProdutoEstoque("Molho Gota", LocalDate.of(2025, 5, 29), 20)); // VenceEm7


        //Produtos a vencer
        System.out.println(ProdutoEstoque.produtosAVencer(produtos) + " produto a vencer \n");


        //Coleta de data, está vencido?
        System.out.println("Digite o dia:");
        int dia = sc.nextInt();
        System.out.println("Digite o mês:");
        int mes = sc.nextInt();
        System.out.println("Digite o ano: (yyyy)");
        int ano = sc.nextInt();
        LocalDate date = LocalDate.of(ano, mes, dia);
        System.out.println(date);
        System.out.println(produtos.get(1).estaVencido(date));
    }
}
