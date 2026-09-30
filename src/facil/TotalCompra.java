package facil;

import java.util.Locale;

public class TotalCompra {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double preco = 39.90;
        int quantidade = 3;

        System.out.printf("Total da compra de R$ %.2f", preco * quantidade);
    }
}
