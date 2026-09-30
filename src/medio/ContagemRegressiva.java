package medio;

public class ContagemRegressiva {

    public static void main(String[] args) {

        int inicial = 10;

        while (inicial > 0) {

            if (inicial == 5) {
                inicial--;
                continue;
            }

            System.out.print(inicial + " ");
            inicial--;
        }
    }
}
