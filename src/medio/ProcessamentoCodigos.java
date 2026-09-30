package medio;

public class ProcessamentoCodigos {
    public static void main(String[] args) {

        int[] codigos = {1, 2, -5, 3, 1, 2, -10, 3, 1, 0, 2, 3};

        int qtd1 = 0, qtd2 = 0, qtd3 = 0;

        for (int i = 0; i < codigos.length; i++) {
            int cod = codigos[i];

            if (cod < 0) {
                continue;
            }

            if (cod == 0) {
                System.out.println("Codigo 0 encontrado. Encerrando processamento...");
                break;
            }

            switch (cod) {
                case 1: qtd1++;
                break;
                case 2: qtd2++;
                break;
                case 3: qtd3++;
                break;
            }
        }

        System.out.println("Total codigo 1: " + qtd1);
        System.out.println("Total codigo 2: " + qtd2);
        System.out.println("Total codigo 3: " + qtd3);
    }
}