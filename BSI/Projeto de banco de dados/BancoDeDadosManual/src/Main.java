public class Main {
    public static void main(String[] args) {
        Services s = new Services();
        s.carregarDados();
        System.out.println("\n----------------------\n");
        s.buscarUsuario("joao");
        s.adicionarUsuario("vitor", "vitor@mail", "(79) 99999-9999");
    }
}