package Lista1Q1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProdutoEstoque {
    private String nome;
    private LocalDate validade;
    private int quantidade;

    public ProdutoEstoque(String nome, LocalDate validade, int quantidade) {
        this.nome = nome;
        this.validade = validade;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataValidade() {
        return validade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean estaVencido(LocalDate validade) {
        return (validade.isAfter(this.validade) || validade.isEqual(this.validade));
    }
    public static int produtosAVencer(List<ProdutoEstoque> produtos) {
        int contador = 0;
        for (int i = 0; i < produtos.size(); i++) {
            boolean estaVencido = produtos.get(i).estaVencido(LocalDate.now());
            boolean venceDepoisDe7Dias = produtos.get(i).getDataValidade().isAfter(LocalDate.now().plusDays(7));
            if (estaVencido || venceDepoisDe7Dias) {
                //não faxer nada
            } else {
                contador++;
                System.out.println("Produto: " + produtos.get(i).getNome() + " - Vencimento: " + produtos.get(i).getDataValidade());
                System.out.println("Data atual: " + LocalDate.now());
                System.out.println("Vence em menos de 7 dias.");
            }
        } return contador;
    }

    public static String extrairDatas(String texto){
        StringBuilder datasEncontradas = new StringBuilder();
        String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            datasEncontradas.append(matcher.group()).append("\n");
        }
        return datasEncontradas.toString();
    }
}
