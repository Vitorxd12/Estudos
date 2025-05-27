package PrimeiroProjeto;

import java.util.HashMap;

public class Professor {
    private static HashMap<String, String> prof = new HashMap<>();
    // revisar este static ai

    Professor(String login, String senha) {
        if (prof.get(login) == null) {
            prof.put(login, senha);
        }
        else {
            System.out.println("Professor já cadastrado");
        }
    }
    public boolean autenticar(String login, String senha) {
        if (prof.get(login).equals(senha)) {
            return true;
        }
        return false;
    }
}
