package facil;

import java.util.Locale;

public class Temperatura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int celsius = 30;
        Double fahrenheit = (double) celsius * 9 / 5 + 32;

        System.out.printf("30°C em F é %.2f°F", fahrenheit);
    }
}
