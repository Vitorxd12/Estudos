public class Usuario {
    private String nome;
    private String email;
    private String telefone;

    Usuario(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String buscarDados() {
        return nome + " " + email + " " + telefone;
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
}
