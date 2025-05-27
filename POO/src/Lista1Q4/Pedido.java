package Lista1Q4;

import java.util.List;

public class Pedido {
    private int numero;
    private double valor;
    private String status;
    private static int idPedido = 0;


    public Pedido(double valor, String status){
        this.numero = gerarNumero();
        this.valor = valor;
        this.status = status.toLowerCase();
    }

    public int gerarNumero(){
        idPedido = idPedido + 1;
        return idPedido;
    }

    public String getStatus(){
        return status;
    }
    public double getValor() {
        return valor;
    }
}
