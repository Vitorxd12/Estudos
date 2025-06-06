package Lista1Q7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnderecoEntrega {
    private String cep;

    public EnderecoEntrega(String cep) {
        String regex = "[0-9]{5}-[0-9]{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cep);
        if (matcher.matches()) {
            this.cep = cep;
        } else {
            System.out.println("CEP inválido. O CEP deve estar no formato 00000-000.");
        }
    }

    public String getCep() {return cep;}

    public boolean isCepAracaju() {
        String inicio = this.cep.substring(0, 3);
        return inicio.equals("490");
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
     //d) Implemente o metodo estático List<String> extrairCepsSergipe(String texto) que retorna todos os CEPs encontrados no texto no formato "49X00-000", onde "X" pode ser 0, 1 ou 2 (regex). */
    public static List<String> extrairCepsSergipe(String texto){
        List<String> lista = new ArrayList<>();
        String regex = "49[0-2][0-9]{2}-[0-9]{3}";
        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(texto);
        while (matcher.find()) {
            lista.add(matcher.group());
        }
        return lista;
    }
}
