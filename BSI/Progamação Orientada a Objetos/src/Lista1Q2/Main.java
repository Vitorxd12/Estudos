package Lista1Q2;

/*
2. Sistema de Notas de Alunos com Estatísticas
a) Classe NotaAluno com nome do aluno e lista de notas (double).
b) Metodo que retorna a média do aluno.
c) Metodo estático que recebe uma lista de alunos e retorna o nome do que tem a maior média.
d) Metodo estático que recebe um texto e, usando regex, extrai todas as ocorrências de notas
    (números com uma casa decimal, tipo “7.5”, “9.0”).
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NotaAluno> turma = new ArrayList<NotaAluno>();
        turma.add(new NotaAluno("João", 7.5, 8.5));
        turma.add(new NotaAluno("Maria", 9.0, 9.5));
        turma.add(new NotaAluno("Pedro", 8.5, 9.0));

        System.out.println("A melhor media foi a de: " + NotaAluno.getMaiorMedia(turma));


        String texto = "As notas dos alunos são: 10, 8.0, 9.75, e 6.5.";
        System.out.println(NotaAluno.extrairNotas(texto));
    }
}
