package Lista1Q4;

import java.util.ArrayList;
import java.util.List;

/*  Controle de Pedidos e Cálculo de Faturamento
a) Classe Pedido com número, valor, status ("pago", "pendente")
b) Metodo para saber se está pendente ou pago.
c) Metodo estático que recebe lista de pedidos e retorna o valor total dos pagos.
d) Metodo estático que recebe texto e usa regex para extrair todos os valores monetários no
formato "R$ 123,45".*/
public class Main {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<Pedido>();

        pedidos.add(new Pedido(100.0, "pago"));
        pedidos.add(new Pedido(200.0, "pendente"));
        pedidos.add(new Pedido(155.0, "pago"));
        pedidos.add(new Pedido(301.0, "pendente"));

        System.out.println(pedidos.get(0).getStatus());
        System.out.println(CalculoDeFaturamento.calcularFaturamento(pedidos));

        String texto = "O valor do produto é R$ 123,45 e o frete é R$ 12,34.";

        System.out.println(CalculoDeFaturamento.extrairValores(texto));
    }
}
