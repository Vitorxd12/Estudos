package Lista1Q7;

import java.util.ArrayList;
import java.util.List;
/*  7. Controle de Endereços de Entrega em Sergipe

a) Implemente a classe EnderecoEntrega com atributo privado cep (String) e um construtor.

b) Implemente o metodo boolean isCepAracaju() que retorna true se o CEP começa com "490"
(indicando Aracaju).

c) Implemente o metodo estático int contarCepsInterior(List<EnderecoEntrega> lista) que retorna
quantos endereços têm CEP começando com "491" ou "492" (indicando interior de Sergipe).

d) Implemente o metodo estático List<String> extrairCepsSergipe(String texto) que retorna todos
os CEPs encontrados no texto no formato "49X00-000", onde "X" pode ser 0, 1 ou 2 (regex). */

public class Main {
    public static void main(String[] args) {
        List<EnderecoEntrega> lista = new ArrayList<>();
        lista.add(new EnderecoEntrega("49000-000"));
        lista.add(new EnderecoEntrega("49100-000"));
        lista.add(new EnderecoEntrega("49200-000"));
        lista.add(new EnderecoEntrega("49400-000"));

        lista.get(0).isCepAracaju();

        EnderecoEntrega.contarCepsInterior(lista);
        String texto = "meu pedido foi entregue no endereço 49000-000, e outro no 49140-000, e mais um no 49200-000, e por último no 49400-000";

        List<String> cepsSergipe = EnderecoEntrega.extrairCepsSergipe(texto);
        for (int i = 0; i < cepsSergipe.size(); i++) {
            System.out.println(cepsSergipe.get(i));
        }
    }
}
