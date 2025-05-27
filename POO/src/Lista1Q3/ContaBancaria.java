package Lista1Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContaBancaria {
    private String numConta;
    private List<Double> movimentacoes;

    public ContaBancaria() {
        this.numConta = gerarNumConta();
        this.movimentacoes = new ArrayList<>();
    }

    public void gerarSaldoExemplo() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int valor = rand.nextInt(100) -50; // Valores entre -50 e +50
            movimentacoes.add(Double.valueOf(valor));
        }
    }

    public String gerarNumConta() {
        Random rand = new Random();
        StringBuilder numConta = new StringBuilder();
        int sum = 0;
        int num = 0;
        for (int i = 0; i < 4; i++) {
            num = rand.nextInt(10);
            sum = sum + num;
            numConta.append(num);
        }
        int digVerif = sum % 10;
        numConta.append("-").append(digVerif);
        return numConta.toString();
    }
    public void transacao(double valor) {
        movimentacoes.add(valor);
    }
    public double saldoAtual() {
        double saldo = 0.0;
        for (int i = 0; i < movimentacoes.size(); i++) {
            saldo += movimentacoes.get(i);
        }
        return saldo;
    }
    public static ContaBancaria contaComMaiorSaldo(List<ContaBancaria> contas){
        double maiorSaldo = 0;
        int indiceMaiorSaldo = 0;
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).saldoAtual() > maiorSaldo) {
                maiorSaldo = contas.get(i).saldoAtual();
                indiceMaiorSaldo = i;
            }
        } return contas.get(indiceMaiorSaldo);
    }
    // String extrato = "Transações: 100, 200, -50, 300, -20, -30, 150.";
    // ContaBancaria.extrairValoresDoExtrato(extrato);
    // d) Metodo estático que recebe um extrato em texto e, usando regex, extrai todos os valores numéricos (entradas e saídas) para analisar

    public static void extrairValoresDoExtrato(String extrato) {
        // Regex: -?[0-9]+\.?[0-9]*
        // -? -> hífen opcional para números negativos
        // [0-9]+ -> um ou mais dígitos antes do ponto
        // \\.? -> ponto decimal opcional
        // [0-9]* -> zero ou mais dígitos após o ponto
        String regex = "-?[0-9]+\\.?[0-9]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(extrato);

        while (matcher.find()) {
            String valor = matcher.group();
            System.out.println("Valor encontrado: " + valor);
        }

    }
}
