package facil;

import java.util.Locale;
import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        boolean maioridade;
        String mensagem;

        if (idade >= 18) {
            maioridade = true;
            mensagem = "Maior de idade";
        } else {
            maioridade = false;
            mensagem = "Menor de idade";
        }

        System.out.printf("Idade: %d anos%n", idade);
        System.out.printf("Booleano: %b%n", maioridade);
        System.out.printf("Mensagem: %s%n", mensagem);

        sc.close();
    }
}
