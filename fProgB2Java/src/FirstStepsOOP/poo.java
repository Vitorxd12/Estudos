package FirstStepsOOP;
/*
o que é um objeto? coisa materail ou abvstrayta que pode ser percebida pelos sentidos e descrita por mio das suas caracteristicas, compoartamentos e estado atual.

obejto: tudo que tem caractareisticas (atributos), comportamento(métodos) e estado atual(caracteristicas atuais).

classe: molde de criar objeto. em uma classe, é necessario rewponder quais atributos o objeto tem, quais são as coisas que ele az e qual o estado atual do objeto.

classe caneta
    atributos: cor, modelo, ponta, carga;
    metodos : escreve, pinta, rabilsca, tampa e destampa; //metodo seria as funções que a caneta desempenha
    estado: 50%de tinta, é azul, está escrevendo //caracteristicas atuais

CHEQUE ARQUIVO Caneta.class PARA VER EXEMPLO

INSTANCIAMENTO =  quando vc pega uma classe e transforma ela em um objeto. sintaxe:
noome da classe + nome do objeto = new nome da classe
Class nome = new Class
Caneta c1 = new Caneta

//agora, instanciando, eu adiciono atributos ao objetop:
c1.cor = a
c1.ponta = 0.9
c1.tampada = falso

//chamando o metodo
c1.rabiscar();

Caneta c2 = new Caneta
c2.cor = v
c2.ponta = 0.7
c2.tampada = verdadeido
c2.rabiscar();

//é possivel criar uma classe e nunca chamar um objeto. quando criamos um objeto c2, usamos instancias para deinir seus atributos
//classes criam objetos por meio de instancias. objetos são instancias d euma classe.

*/
public class poo {
    public static void main(String[] args){
        //Criando novo objeto c1 com a classe Caneta
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.tampada =false;

        //testando os metodos de c1
        c1.estado();
        c1.rabiscar();
        c1.tampar();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();

    }
}

