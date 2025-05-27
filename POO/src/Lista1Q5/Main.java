package Lista1Q5;

import java.time.LocalDate;
import java.util.List;

/*
. Diário de Exercícios Físicos
a) Classe Exercicio com nome, data, duração em minutos.
b) Metodo para retornar se o exercício é “longo” (>60 min).
c) Metodo estático para calcular o total de minutos feitos em uma lista em uma data específica.
d) Metodo estático para extrair datas válidas de um texto (regex).
*/
public class Main {
    public static void main(String[] args) {
        List<Exercicio> exercicios = List.of(
            new Exercicio("Corrida", LocalDate.of(2023, 10, 1), 45),
            new Exercicio("Caminhada", LocalDate.of(2023, 10, 1), 30),
            new Exercicio("Natação", LocalDate.of(2023, 10, 2), 70),
            new Exercicio("Ciclismo", LocalDate.of(2023, 10, 2), 90)
        );

        System.out.println(Exercicio.totalDoDia(exercicios, LocalDate.of(2023, 10, 1)));

        String texto = "Fiz exercícios em 01-10-2024, 02/10/2023, mas não em 03/10/24";
        String datasValidas = Exercicio.extrairDatasValidas(texto);
        System.out.println(datasValidas);
    }
}
