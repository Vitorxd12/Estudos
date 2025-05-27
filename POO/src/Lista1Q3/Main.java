package Lista1Q3;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/*
3. Mini-Banco com Movimentação e Análise
a) Classe ContaBancaria com número da conta e lista de movimentações (valores positivos e
negativos).
b) Metodo que retorna o saldo atual.
c) Metodo estático que retorna a conta com maior saldo de uma lista.
d) Metodo estático que recebe um extrato em texto e, usando regex, extrai todos os valores
    numéricos (entradas e saídas) para analisar
 */
public class Main {
    public static void main(String[] args) {
        List<ContaBancaria> contas = new ArrayList<ContaBancaria>();

        //gera 3 contas de teste
        for (int i = 0; i < 3; i++) {
            contas.add(new ContaBancaria());
            contas.get(i).gerarSaldoExemplo();
            System.out.println(contas.get(i).saldoAtual());
        }

        System.out.println(ContaBancaria.contaComMaiorSaldo(contas).saldoAtual());

        String extrato = "Transações: 100, 200.5, -50.22, 300.75, -20, -30.5, 150.";
        ContaBancaria.extrairValoresDoExtrato(extrato);

    }
}
