package PrimeiroProjeto; //por estar no mesmo pacote, eles ja conversam entre si

import java.util.HashMap;

public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private double notaFinal;

    public Aluno(String nome, int idade) { // da pra reconhecer um metodo construtor por que ele tem o mesmo nome da classe + alguns atribuyos. ele serve para setar algo como inicial e provisorio, mas não será usado para atribuir
        this.nome = nome;
        this.idade = idade;
        this.matricula = "x000000";
        this.notaFinal = 00;
    }

    public void setMatricula(String matricula){
        if(matricula.length() == 6 && Character.isLetter(matricula.charAt(0))) {
            this.matricula = matricula;
        }
        else {
            System.out.println("erro na hora de definir a matricula");
        }
    }
    public void setNotaFinal(String login, String senha, double nota){
        HashMap<String, String> prof = new HashMap<>();

        prof.put("Prof. Ana", "ana123");
        prof.put("Prof. Pedro", "pedro123");

        if (prof.get(login).equals(senha)) {
            this.notaFinal = nota;
        } else {
            System.out.println("Login ou senha incorretos");
        }
    }

    public void getStatus(String senha){
        if (senha.equals("senha123")){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Matricula: "+ matricula);
            System.out.println("Nota Final: " + notaFinal);
        } else {
            System.out.println("Senha errada");
        }
    }
}
