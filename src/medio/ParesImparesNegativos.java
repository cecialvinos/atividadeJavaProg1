package medio;

public class ParesImparesNegativos {

    public static void main(String[] args) {

        int[] numeros = {10, 30, -90, 32, 3, -2, 0, 2, 21, 43};

        int qntPar = 0;
        int qntImpar = 0;
        int qntNegativo = 0;

        for (int numero : numeros) {

            if (numero == 0) {
                continue;
            }

            if (numero % 2 != 0) {
                qntImpar++;
            } else {
                qntPar++;
            }

            if (numero < 0) {
                qntNegativo++;
            }
        }

        System.out.println("Existe " + qntPar + " pares no array");
        System.out.println("Existe " + qntImpar + " impares no array");
        System.out.println("Existe " + qntNegativo + " negativos no array");
    }
}
