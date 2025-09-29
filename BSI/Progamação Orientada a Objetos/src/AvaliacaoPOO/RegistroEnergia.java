package AvaliacaoPOO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistroEnergia {
    private String nomeSetor;
    private List<Double> consumoDiario;

    public RegistroEnergia(String nomeSetor, List<Double> consumoDiario) {
        this.nomeSetor = nomeSetor;
        this.consumoDiario = consumoDiario;
    }
    public String getNomeSetor() {
        return nomeSetor;
    }
    
    public double consumoTotal(){
        double total = 0;
        for (int i = 0; i < consumoDiario.size(); i++) {
            total += consumoDiario.get(i);
        }
        return total;
    }
    //collections.
    public static String setorMaisEconomico(List<RegistroEnergia> setores) {
        String setorMaisEconomicoNome = "";
        double setorMaisEconomicoValor = 0;
        for (int i = 0; i < setores.size(); i++) {
            if (setores.get(i).consumoTotal() < setorMaisEconomicoValor || i == 0) {
                setorMaisEconomicoValor = setores.get(i).consumoTotal();
                setorMaisEconomicoNome = setores.get(i).getNomeSetor();
            };
        }
        return setorMaisEconomicoNome;
    }
    public static List<Double> extrairConsumos(String texto) {
        List<Double> consumos = new ArrayList<>();
        //regex para encontrar os valores válidos em string
        String regex = "\\s[0-9]+\\.?[0-9]?\\skWh";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            //regex para remover partes do texto como kWh e espaços, facilitando a troca para double
            double valor = RegistroEnergia.consumoToDouble(matcher.group());
            consumos.add(valor);
        }
        Collections.sort(consumos);
        return consumos;
    }

    public static double consumoToDouble(String consumo){
        double valor = 0;
        String regex = "[0-9]+\\.?[0-9]?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(consumo);
        if (matcher.find()) {
            valor = Double.parseDouble(matcher.group());
        }
        return valor;
    }
}
