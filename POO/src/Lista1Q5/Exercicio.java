package Lista1Q5;

import java.time.LocalDate;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio {
    private String nome;
    private LocalDate data;
    private int duracaoMinutos;

    public Exercicio(String nome, LocalDate data, int duracaoMinutos) {
        this.nome = nome;
        this.data = data;
        this.duracaoMinutos = duracaoMinutos;
    }
    public LocalDate getData() {
        return data;
    }
    public boolean exercicioELongo() {
        return duracaoMinutos > 60;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public static int totalDoDia(List<Exercicio> exercicios, LocalDate data) {
        int total = 0;
        for (int i = 0; i < exercicios.size(); i++) {
            if(exercicios.get(i).getData().equals(data)){
                total += exercicios.get(i).getDuracaoMinutos();
            }
        }
        return total;
    }
    public static String extrairDatasValidas(String texto){
        // Extrai datas válidas no formato dd-mm-aaaa, dd/mm/aa, dd-mm-aa, dd/mm/aaaa
        // Regex: [0-9]{2}[-/][0-9]{2}[-/]([0-9]{4}|[0-9]{2})
        // [0-9]{2} -> dois dígitos para dia
        // [-/] -> hífen ou barra como separador
        // [0-9]{2} -> dois dígitos para mês
        // [-/] -> hífen ou barra como separador
        // ([0-9]{4}|[0-9]{2}) -> 4 ou 2 dígitos para ano
        String regex = "[0-9]{2}[-/][0-9]{2}[-/]([0-9]{4}|[0-9]{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        StringBuilder datasValidas = new StringBuilder();

        while(matcher.find()){
            datasValidas.append(matcher.group()).append("\n");
        }

        return datasValidas.toString();
    }
}
