package PrimeiroProjeto;

public class PrimeiroProjeto {
    public static void main(String[] args) {
        Aluno aluno_1 = new Aluno("Maria", 18); //Sempre que for criar um metodo novo de uma classe com metodo construtor, é necessario colocar os dois parametros iniciais pois se não da erro.


        Aluno aluno_2 = new Aluno("Pedro", 22);

        aluno_1.setMatricula(("b23456").toUpperCase());
        aluno_1.setNotaFinal("Prof. Pedro", "pedro123", 7);
        aluno_1.getStatus("senha123");


    }
}


//estudar hashmap