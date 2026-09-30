package medio;

public class TabuadaMatriz {

    public static void main(String[] args) {

        int[][] tabuada = new int[5][5];

        for (int linha = 0; linha < tabuada.length; linha++) {
            for (int coluna = 0; coluna < tabuada[linha].length; coluna++) {
                tabuada[linha][coluna] = (linha + 1) * (coluna + 1);
            }
        }

        for (int[] linha : tabuada) {
            for (int conteudo : linha) {
                System.out.print(conteudo + "\t");
            }
            System.out.println();
        }
    }
}
