package FirstStepsOOP;

public class Caneta {
    //atributos
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    //metodos
    void estado(){
        //this: vai ser substituido pelo nome do objeto que a classe criou
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar(){
        if (tampada){
           System.out.println("erro");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    void tampar(){
        System.out.println("Tampando...");
        this.tampada = true;
    }
    void destampar(){
        System.out.println("Destampando...");
        this.tampada = false;
    }
}
