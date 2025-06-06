package QuestaoDesafio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("|-----Questão Desafio------|");
        System.out.println("|---Criptografia Simples---|");
        String textoOriginal = "Ola Mundo!";
        System.out.println("Texto original: \n" + textoOriginal);
        CriptoSimples mensagem = new CriptoSimples(textoOriginal);
        System.out.println("\nCifra de César:");
        System.out.println(mensagem.cifraCesar(1));

        System.out.println("\nDividir texto em partes:");
        String texto = "acb123def456ghi789jkl00001";
        System.out.println("Texto original: " + texto);
        List<String> partes = CriptoSimples.separarEmPartes(texto, 3);
        for (int i = 0; i < partes.size(); i++) {
            System.out.println("Parte " + (i + 1) + ": " + partes.get(i));
        }
        System.out.println("\nGerar senha forte:");
        System.out.println(CriptoSimples.gerarSenhaForte(10));
    }
}
