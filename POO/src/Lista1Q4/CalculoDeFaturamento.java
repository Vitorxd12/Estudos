package Lista1Q4;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculoDeFaturamento {
    public static double calcularFaturamento(List<Pedido> pedidos){
        double total = 0;
        for (Pedido pedido : pedidos) {
            if (pedido.getStatus().equals("pago")) {
                total += pedido.getValor();
            }
        }
        return total;
    }
    public static String extrairValores(String texto) {
        // R\$ -> símbolo do real
        // \s* -> espaço opcional após R$
        // [0-9]+ -> um ou mais dígitos antes da vírgula
        // ,? -> vírgula opcional
        // [0-9]* -> zero ou mais dígitos após a vírgula
        String regex = "R\\$\\s*[0-9]+,?[0-9]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        StringBuilder valores = new StringBuilder();
        while (matcher.find()) {
            valores.append(matcher.group()).append("\n");
        }
        return valores.toString();
    }
}
