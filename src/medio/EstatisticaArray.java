package medio;

public class EstatisticaArray {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 29, 3, 17, 24};

        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior)
                maior = numeros[i];
            if (numeros[i] < menor)
                menor = numeros[i];
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Soma total : " + soma);
        System.out.printf("Media      : %.2f%n", media);
    }
}