package QuestaoDesafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CriptoSimples {
    private String mensagem;

    public CriptoSimples(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public static String gerarChar(int tipo) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "1234567890";
        String simbolos = "!@#$%^&*()_+[]{}|;':\",./<>?`~";

        switch (tipo) {
            case 1: // letra
                return String.valueOf(alfabeto.charAt((int) (Math.random() * alfabeto.length())));
            case 2: // dígito
                return String.valueOf(numeros.charAt((int) (Math.random() * numeros.length())));
            case 3: // símbolo
                return String.valueOf(simbolos.charAt((int) (Math.random() * simbolos.length())));
            case 4: //  letra maiuscula
                return String.valueOf(alfabeto.charAt((int) (Math.random() * alfabeto.length()))).toUpperCase();
            case 5: // caracteraleatorio
                String todosCaracteres = alfabeto + numeros + simbolos;
                if (Math.random() < 0.5) {
                    todosCaracteres += alfabeto.toUpperCase(); // adiciona letras maiúsculas aleatoriamente
                }
                return String.valueOf(todosCaracteres.charAt((int) (Math.random() * todosCaracteres.length())));
            default:
                return "";
        }
    }

    public static String embaralharSenha(String senha) {
        StringBuilder senhaEmbaralhada = new StringBuilder();
        Random random = new Random();
        boolean[] usado = new boolean[senha.length()];
        char[] caracteres = senha.toCharArray();

        while (senhaEmbaralhada.length() < senha.length()) {
            int posicao = random.nextInt(usado.length);
            if (!usado[posicao]) {
                senhaEmbaralhada.append(caracteres[posicao]);
                usado[posicao] = true; // marca a posição como usada
            }
        }
        return senhaEmbaralhada.toString();
    }

    public static String gerarSenhaForte(int tamanho) {
        StringBuilder senha = new StringBuilder();
        //gerarLetraMaius
        senha.append(gerarChar(4));
        //GerarDigito
        senha.append(gerarChar(2));
        //GerarDigito
        senha.append(gerarChar(2));
        //GerarSimbolo
        senha.append(gerarChar(3));
        //for 6 gerarCaracter
        int caracteresRestantes = tamanho - senha.length();
        for (int i = 0; i < caracteresRestantes; i++) {
            senha.append(gerarChar(5)); // gerar caracter aleatorio
        }
        //scramble
        String senhaEmbaralhada = embaralharSenha(senha.toString());
        return senhaEmbaralhada;
    }

    public static List<String> separarEmPartes(String texto, int tamanho) {
        List<String> partes = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        int cont = 0;

        for (int i = 0; i < texto.length(); i++) {
            sb.append(texto.charAt(i));
            cont++;
            if (cont >= tamanho) {
                partes.add(sb.toString());
                sb.setLength(0);
                cont = 0;
            }
            if (i == texto.length() - 1 && cont > 0) {
                partes.add(sb.toString());
            }
        }
        return partes;
    }


    //loucura loucura loucura
    public String cifraCesar(int deslocamento) {
        //variaveis
        String regex = "[a-zA-Z0-9\\s]+";
        StringBuilder resultado = new StringBuilder();
        String alfabeto = "abcdefghijklmnopqrstuvwxyz 1234567890";
        //para cada caracter da mensagem
        for (int i = 0; i < mensagem.length(); i++) {
            //verifica se é um simbolo, se for, adiciona ao resultado
            if (!String.valueOf(mensagem.charAt(i)).matches(regex)) {
                resultado.append(mensagem.charAt(i));
            }
            //para cada caracter do alfabeto
            for (int j = 0; j < alfabeto.length(); j++) {
                //verifica se o caracter da mensagem é igual ao caracter do alfabeto. se for simbolo, não vai ter no alfabeto, mas ja foi adicionado ao resultado ateriormente
                if (mensagem.toLowerCase().charAt(i) == alfabeto.charAt(j)) {
                    //tenta adicionar o caracter do alfabeto com o deslocamento
                    try {
                        resultado.append(alfabeto.charAt(j + deslocamento));
                        //se o caracter for maior que o tramanho do alfabeto, subtrai o tamanho do alfabeto para voltar ao inicio
                    } catch (Exception e) {
                        resultado.append(alfabeto.charAt(j + deslocamento - alfabeto.length()));
                    }
                }

            }
        }
        return resultado.toString();
    }
}
