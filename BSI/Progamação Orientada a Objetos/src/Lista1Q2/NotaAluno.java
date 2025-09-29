package Lista1Q2;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotaAluno {
    private String nome;
    private double[] nota;

    public NotaAluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota = new double[]{nota1, nota2};
    }

    public double getMedia() {
        return (this.nota[0] + this.nota[1]) / this.nota.length;
    }

    public String getNome() {
        return nome;
    }

    public static String getMaiorMedia(List<NotaAluno> turma) {
        double maiorMedia = 0;
        String nomeMaiorMedia = "";
        for (int i = 0; i < turma.size(); i++) {
            if (turma.get(i).getMedia() > maiorMedia) {
                nomeMaiorMedia = turma.get(i).getNome();
                maiorMedia = turma.get(i).getMedia();
            }
        }
        return nomeMaiorMedia;
    }

    public static String extrairNotas(String texto) {
        String regex = "([0-9]+\\.[0-9]*)|[0-9]{2}"; //digito, zero a nove, um ou mais, ponto literal, digito, zero a nove, zero ou mais.
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        StringBuilder textoRetorno = new StringBuilder();

        while (matcher.find()) {
            textoRetorno.append(matcher.group()).append("\n");
        }
        return textoRetorno.toString();
    }
}
