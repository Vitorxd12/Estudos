package Lista1Q6;
/*
 6. Análise Simples de IPs em Logs
 a) Implemente a classe LogSimples com atributo privado ip (String) e um construtor.
 b) Implemente o metodo boolean isLocalhost() que retorna true se o IP for "127.0.0.1".
 c) Implemente o metodo estático int contarIpsIguais(List<LogSimples> lista, String ip) que conta
 quantas vezes o mesmo IP aparece.
 d) Implemente o metodo estático List<String> extrairIps(String texto) que retorna todos os IPs do
 texto no formato "n.n.n.n" onde n é de 0 a 255 (regex simples).
 */


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LogSimples> logs = new ArrayList<>();
        logs.add(new LogSimples("127.0.0.1"));
        logs.add(new LogSimples("127.0.0.1"));
        logs.add(new LogSimples("355.13.0.143")); // invalid IP
        logs.add(new LogSimples("121.237.3.215"));
        logs.add(new LogSimples("127.0.0.1"));


        String texto = LogSimples.listaParaTexto(logs);

        List<String> ipsExtraidos = LogSimples.listaDeIps(texto);
        for (int i = 0; i < ipsExtraidos.size(); i++) {
            System.out.println(ipsExtraidos.get(i));
        }
        System.out.println("\n" + LogSimples.contarIpsIguais(logs, logs.get(0).getIp()) + " Ip's Iguais");

    }
}
