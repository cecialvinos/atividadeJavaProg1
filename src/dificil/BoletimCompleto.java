package dificil;

// um array com nomes de 5 alunos e uma matriz 5x3 com notas
// para cada aluno, calcule média e situação (Aprovado, Recuperação ou Reprovado)
// média geral da turma, a maior média, a menor média e a porcentagem de aprovados
// exibir um relatório textual organizado.

import java.util.Locale;
import java.util.Scanner;

public class BoletimCompleto {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] alunos = new String[5];
        double[][] notas = new double[5][3];
        double[] medias = new double[5];
        String[] situacoes = new String[5];

        int aprovados = 0;
        double qntAprovados = 0.0;
        double menorMedia = 10.0;
        double maiorMedia = 0.0;
        double mediaGeral = 0.0;
        double somarMedias = 0.0;

        for (int aluno = 0; aluno < alunos.length; aluno++) {
            System.out.printf("Nome do %dº aluno: ", aluno + 1);
            alunos[aluno] = sc.nextLine();

            double soma = 0;
            double media = 0;

            for (int nota = 0; nota < notas[aluno].length; nota++) {
                System.out.printf("Nota %d: ", nota + 1);
                notas[aluno][nota] = sc.nextDouble();
                while (notas[aluno][nota] > 10 || notas[aluno][nota] < 0) {
                    System.out.println("Nota inválida, digite novamente: ");
                    System.out.printf("Nota %d: ", nota + 1);
                    notas[aluno][nota] = sc.nextDouble();

                }
                soma += notas[aluno][nota];
            }

            media = soma / notas[aluno].length;
            medias[aluno] = media;
            somarMedias += media;

            if (media >= 7) {
                situacoes[aluno] = "Aprovado";
                aprovados++;
            } else if (media >= 5) {
                situacoes[aluno] = "Recuperação";
            } else {
                situacoes[aluno] = "Reprovado";
            }

            if (media > maiorMedia) {
                maiorMedia = media;
            }
            if (media < menorMedia) {
                menorMedia = media;
            }

            sc.nextLine();
            System.out.println();

        }

        qntAprovados = ( (double) aprovados / alunos.length) * 100;
        mediaGeral = somarMedias / alunos.length;

        System.out.println("========= RELATÓRIO ==========");
        for (int aluno = 0; aluno < alunos.length; aluno++) {
            System.out.printf("Nome: %-20.20s | Média: %-6.2f | Situação: %s%n",
                    alunos[aluno], medias[aluno], situacoes[aluno]);
        }

        System.out.println();
        System.out.printf("A média geral da turma é: %.2f%n", mediaGeral);
        System.out.printf("A menor média da turma é: %.2f%n", menorMedia);
        System.out.printf("A maior média da turma é: %.2f%n", maiorMedia);
        System.out.printf("A turma teve: %.2f%% aprovados%n", qntAprovados);

        sc.close();
    }
}