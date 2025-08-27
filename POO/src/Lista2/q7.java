package Lista2;

import java.util.function.BiFunction;

//Crie uma BiFunction<String, Integer, String> que receba um nome e uma idade e
//retorne: "Nome: Jo~ao, Idade: 30". Teste com 3 pessoas diferentes.
public class q7 {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> apresentarPessoa = (nome, idade) -> "Nome: " + nome + ", Idade: " + idade;
        System.out.println(apresentarPessoa.apply("João", 30));   // Nome: João, Idade: 30
        System.out.println(apresentarPessoa.apply("Maria", 25));  // Nome: Maria, Idade: 25
        System.out.println(apresentarPessoa.apply("Pedro", 40));  // Nome: Pedro, Idade: 40
    }
}
