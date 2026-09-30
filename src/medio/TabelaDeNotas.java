package medio;

import java.util.Scanner;

public class TabelaDeNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] notas = new int[3][3];
        int soma = 0;
        String nome;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        for (int nota = 0; nota < notas.length; nota++) {
            System.out.printf("Digite sua %dº nota: ", nota + 1);
            int notinha = sc.nextInt();
            soma =+ nota;
        }

        double media = soma / notas.length;
        System.out.println(media);


    sc.close();
    }
}
