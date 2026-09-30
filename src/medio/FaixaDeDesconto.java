package medio;

import java.util.Locale;
import java.util.Scanner;

public class FaixaDeDesconto {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        double pricePurchase = sc.nextDouble();
        double valorFinal = pricePurchase;
        System.out.print("Código do cliente (1 = comum, 2 = prata, 3 = ouro): ");
        int clientCode = sc.nextInt();

        switch (clientCode) {

            case 1:
                System.out.println("Sem desconto");
                break;

            case 2:
                System.out.println("Vc tem 5% de desconto");
                valorFinal = pricePurchase - (pricePurchase * 0.05);
                break;

            case 3:
                System.out.println("Vc tem 10% de desconto");
                valorFinal = pricePurchase - (pricePurchase * 0.10);
                break;

            default:
                System.out.println("Cliente inválido");
        }

        if (pricePurchase > 500) {
            valorFinal = valorFinal - (pricePurchase * 0.05);
        }

        System.out.printf("Valor final de: R$ %.2f", valorFinal);

    }
}
