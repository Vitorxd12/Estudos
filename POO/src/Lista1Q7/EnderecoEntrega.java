package Lista1Q7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnderecoEntrega {
    private String cep;

    public EnderecoEntrega(String cep) {
        this.cep = cep;
    }
    public String getCep() {return cep;}

    public boolean isCepAracaju() {
        String inicio = this.cep.substring(0, 3);
        if (inicio.equals("490")) {
            System.out.println("Endereco Aracaju");
            return true;
        } else return false;
    }
    public static int contarCepsInterior(List<EnderecoEntrega> lista){
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            String inicio = lista.get(i).getCep().substring(0, 3);
            if (inicio.equals("491")|| inicio.equals("492")) {
                contador++;
            }
        }
        System.out.println(contador);
        return contador;
    }
    public static ArrayList<String> extrairCepsSergipe(String texto){
        ArrayList<String> lista = new ArrayList<>();
        Pattern padrao = Pattern.compile("^494[0-9]-[0-9]{3}$");
        Matcher matcher = padrao.matcher(texto);
        System.out.println(matcher.matches());
        while (matcher.find()) {
            lista.add(matcher.group());
            System.out.println(matcher.group());
        }
        return lista;
    }
}
