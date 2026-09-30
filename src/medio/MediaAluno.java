package medio;

import java.util.Locale;
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] alunos = new String[3];
        int[][] notas = new int[3][3];
        double[] medias = new double[3];

        double maiorMedia = 0;
        String maiorAlunoMedia = "";

        for (int aluno = 0; aluno < alunos.length; aluno++) {
            System.out.printf("Nome do aluno %d: ", aluno + 1);
            alunos[aluno] = sc.nextLine();

            int soma = 0;

            for (int nota = 0; nota < notas.length; nota++) {
                System.out.printf("Nota %d: ", nota + 1);
                notas[aluno][nota] = sc.nextInt();
                soma += notas[aluno][nota];
            }

            System.out.println();
            medias[aluno] = (double) soma / notas[aluno].length;

            if (medias[aluno] > maiorMedia ) {
                maiorMedia = medias[aluno];
                maiorAlunoMedia = alunos[aluno];
            }

            sc.nextLine(); // deu trabalho descobrir esse négocio
        }

        System.out.println("========= RESULTADO ==========");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Aluno: %s | Média: %.2f%n", alunos[i], medias[i]);
        }

        System.out.println();
        System.out.println("======== MAIOR MÉDIA ENTRE ALUNOS =======");
        System.out.printf("Aluno com maior média: %s (%.2f)%n", maiorAlunoMedia, maiorMedia);

        sc.close();
    }
}