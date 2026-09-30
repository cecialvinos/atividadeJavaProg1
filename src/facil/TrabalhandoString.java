package facil;

import java.util.Locale;

public class TrabalhandoString {
    public static void main(String[] args) {

        String nome = "Laura Camilly Silva de Aquino";

        String maiuscula = nome.toUpperCase();
        String minuscula = nome.toLowerCase();
        String semEspaco = nome.replace(" ", "");
        int quantidade = semEspaco.length();

        System.out.printf("Nome original: %s%n", nome);
        System.out.printf("Nome maiuscuclo: %s%n", maiuscula);
        System.out.printf("Nome minusculo: %s%n", minuscula);
        System.out.printf("Quantidade de caracteres: %d%n", quantidade);

    }
}
