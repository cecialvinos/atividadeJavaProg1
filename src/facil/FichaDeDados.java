package facil;

import java.util.Locale;

public class FichaDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String nome = "Alvino";
        int idade = 19;
        double altura = 1.65;
        char turma = 'C';
        boolean matricula = true;

        System.out.printf("Nome do aluno: %s%n", nome);
        System.out.printf("Idade do aluno: %d anos%n", idade);
        System.out.printf("Altura do aluno: %.2fm%n", altura);
        System.out.printf("Turma do aluno: %c%n", turma);
        System.out.printf("Matricula Ativa: %b%n", matricula);
    }
}

