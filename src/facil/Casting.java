package facil;

import java.util.Locale;

public class Casting {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double original = 8.75;
        int convertido = (int) original;

        System.out.printf("valor original: %.2f%n", original);
        System.out.printf("valor original: %d%n", convertido); // essa ação de deixar o double em inteiro, chama-se "casting".
    }
}
