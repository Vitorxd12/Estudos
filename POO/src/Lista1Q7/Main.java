package Lista1Q7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<EnderecoEntrega> lista = new ArrayList<EnderecoEntrega>();
        lista.add(new EnderecoEntrega("49000-000"));
        lista.add(new EnderecoEntrega("49100-000"));
        lista.add(new EnderecoEntrega("49200-000"));
        lista.add(new EnderecoEntrega("49400-000"));

        lista.get(0).isCepAracaju();

        EnderecoEntrega.contarCepsInterior(lista);
        ArrayList<String> cepsSergipe = EnderecoEntrega.extrairCepsSergipe("diufuasdfksalfkjasdlfkasjfkk49400-000kasldjfasldkfjasdlkçf");
        for (int i = 0; i < cepsSergipe.size(); i++) {
            System.out.println(cepsSergipe.get(i));
        }
    }
}
