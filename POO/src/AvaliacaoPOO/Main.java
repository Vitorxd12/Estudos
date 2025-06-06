package AvaliacaoPOO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> ti = Arrays.asList(23.5, 24.0, 22.8);
        List<Double> rh = Arrays.asList(15.0, 14.2, 13.9);
        List<Double> financeiro = Arrays.asList(20.0, 19.5, 21.0);
        RegistroEnergia r1 = new RegistroEnergia("TI", ti);
        RegistroEnergia r2 = new RegistroEnergia("RH", rh);
        RegistroEnergia r3 = new RegistroEnergia("Financeiro", financeiro);

        List<RegistroEnergia> setores = Arrays.asList(r1, r2, r3);
        System.out.println("Setor mais econômico: " + RegistroEnergia.setorMaisEconomico(setores));

        String texto = "Consumo do dia: 23.5 kWh, -12 kWh, 30 kWh, 45.2 kWh, erro, 15kWh, 56, 79Wh, 100W";
        List<Double> extraidos = RegistroEnergia.extrairConsumos(texto);
        System.out.println("Consumos extraídos: " + extraidos);

        //NOTA = 10!!!!

    }
}
