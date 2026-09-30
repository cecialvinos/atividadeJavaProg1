package medio;

public class PrimeiroDivisor {
    public static void main(String[] args) {

        int num = 9;
        boolean achado = false;


        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                achado = true;
                System.out.println("Primeiro divisor: " + i);
                break;
            }
        }
        if (!achado) {
            System.out.println("O numero é primo");
        }
    }
}


