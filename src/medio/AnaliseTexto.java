package medio;

public class AnaliseTexto {
    public static void main(String[] args) {
        String frase = "Eu estou aprendendo Java com exercicios praticos";

        int tamanho = frase.length();
        String maiuscula = frase.toUpperCase();
        boolean contemJava = maiuscula.indexOf("JAVA") != -1;

        System.out.println("Frase original: " + frase);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Em maiusculas: " + maiuscula);

        if (contemJava) {
            System.out.println("A palavra 'JAVA' foi encontrada na frase!");
        } else {
            System.out.println("A palavra 'JAVA' nao foi encontrada.");
        }
    }
}