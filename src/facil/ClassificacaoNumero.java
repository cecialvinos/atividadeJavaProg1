package facil;

import java.util.Scanner;

public class ClassificacaoNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negativo");
        }

        sc.close();
    }
}
