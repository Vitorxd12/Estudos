package Lista1Q6;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogSimples {
    private String ip;

    public LogSimples(String ip) {
        this.ip = ip;
    }

    public boolean isLocalHost() {
        return this.ip.equals("127.0.0.1");
    }

    public String getIp() {
        return ip;
    }

    public static int contarIpsIguais(List<LogSimples> logs, String ip) {
        int cont = 0;
        for (int i = 0; i < logs.size(); i++) {
            if (logs.get(i).getIp().equals(ip)) {
                cont++;
            }
        }
        return cont;
    }
    public static String listaParaTexto(List<LogSimples> logs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < logs.size(); i++) {
            sb.append(logs.get(i).getIp()).append("\n");
        } return sb.toString();
    }
    public static List<String> listaDeIps(String texto) {
        List<String> ips = new ArrayList<>();
        String regex = "\\b(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            ips.add(matcher.group());
        }
        return ips;
    }
}
