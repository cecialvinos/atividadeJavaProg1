package facil;

import java.util.Scanner;

public class PercorrendoArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        int soma = 0;

        for (int num = 0; num < array.length; num++) {
            System.out.printf("Digite seu %dº número: ", num + 1);
            array[num] = sc.nextInt();
        }

        System.out.print("Array: ");

        for (int num = 0; num < array.length; num++) {
            System.out.printf("%d ", array[num]);
        }

        for (int num = 0; num < array.length; num++) {
            soma += array[num];
        }

        System.out.println();
        System.out.printf("Soma: %d", soma);

        sc.close();
    }
}
