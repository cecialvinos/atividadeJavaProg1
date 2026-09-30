package dificil;

// arrays para nomes de 5 produtos e preços, e uma matriz com as quantidades vendidas em 4 semanas
// calcule faturamento por produto, faturamento total, produto com maior faturamento e quantidade total vendida.
// Classifique cada produto em A, B ou C conforme seu faturamento usando condicionais
// exiba um relatório.

public class RelatorioVendas {

    public static void main(String[] args) {

        String[] produtos = {"Leite", "Farinha", "Maizena", "Biscoito", "Melancia"};
        double[] valor = {5.00, 7.90, 3.50, 1.99, 5.90};
        int[][] vendasSemanas = {{440, 150, 320, 920, 830}, {590, 620, 450, 743, 253}, {430, 530, 344, 553, 357}, {228, 254, 275, 532, 193}};

        double fatLeite = valor[0] * (vendasSemanas[0][0] + vendasSemanas[1][0] + vendasSemanas[2][0] + vendasSemanas[3][0]);
        double fatFarinha = valor[1] * (vendasSemanas[0][1] + vendasSemanas[1][1] + vendasSemanas[2][1] + vendasSemanas[3][1]);
        double fatMaizena = valor[2] * (vendasSemanas[0][2] + vendasSemanas[1][2] + vendasSemanas[2][2] + vendasSemanas[3][2]);
        double fatBiscoito = valor[3] * (vendasSemanas[0][3] + vendasSemanas[1][3] + vendasSemanas[2][3] + vendasSemanas[3][3]);
        double fatMelancia = valor[4] * (vendasSemanas[0][4] + vendasSemanas[1][4] + vendasSemanas[2][4] + vendasSemanas[3][4]);

        int vendaLeite = vendasSemanas[0][0] + vendasSemanas[1][0] + vendasSemanas[2][0] + vendasSemanas[3][0];
        int vendaFarinha = vendasSemanas[0][1] + vendasSemanas[1][1] + vendasSemanas[2][1] + vendasSemanas[3][1];
        int vendaMaizena = vendasSemanas[0][2] + vendasSemanas[1][2] + vendasSemanas[2][2] + vendasSemanas[3][2];
        int vendaBiscoito = vendasSemanas[0][3] + vendasSemanas[1][3] + vendasSemanas[2][3] + vendasSemanas[3][3];
        int vendaMelancia = vendasSemanas[0][4] + vendasSemanas[1][4] + vendasSemanas[2][4] + vendasSemanas[3][4];

        double fatTotal = fatLeite + fatFarinha + fatMaizena + fatBiscoito + fatMelancia;
        int totalVendas = vendaLeite + vendaFarinha + vendaMaizena + vendaBiscoito + vendaMelancia;
        double[] faturamento = {fatLeite, fatFarinha, fatMaizena, fatBiscoito, fatMelancia};

        double maiorFat = faturamento[0];
        String prodMaiorFat = produtos[0];
        char[] classificacao = new char[5];

        for (int i = 0; i < faturamento.length; i++) {
            if (maiorFat < faturamento[i]) {
                maiorFat = faturamento[i];
                prodMaiorFat = produtos[i];
            }

            if (faturamento[i] >= 10000) {
                classificacao[i] = 'A';
            } else if (faturamento[i] >= 5000) {
                classificacao[i] = 'B';
            } else {
                classificacao[i] = 'C';
            }
        }

        System.out.println("===================================================== RELATÓRIO =========================================================");
        System.out.printf("Produto: %-10s | Valor: R$ %.2f \t| Vendas mensal: %d \t| Faturamento mensal: R$ %.2f \t| Classificação: %c |%n", produtos[0], valor[0], vendaLeite, fatLeite, classificacao[0]);
        System.out.printf("Produto: %-10s | Valor: R$ %.2f \t| Vendas mensal: %d \t| Faturamento mensal: R$ %.2f \t| Classificação: %c |%n", produtos[1], valor[1], vendaFarinha, fatFarinha, classificacao[1]);
        System.out.printf("Produto: %-10s | Valor: R$ %.2f \t| Vendas mensal: %d \t| Faturamento mensal: R$ %.2f \t| Classificação: %c |%n", produtos[2], valor[2], vendaMaizena, fatMaizena, classificacao[2]);
        System.out.printf("Produto: %-10s | Valor: R$ %.2f \t| Vendas mensal: %d \t| Faturamento mensal: R$ %.2f \t| Classificação: %c |%n", produtos[3], valor[3], vendaBiscoito, fatBiscoito, classificacao[3]);
        System.out.printf("Produto: %-10s | Valor: R$ %.2f \t| Vendas mensal: %d \t| Faturamento mensal: R$ %.2f \t| Classificação: %c |%n", produtos[4], valor[4], vendaMelancia, fatMelancia, classificacao[4]);
        System.out.println("=========================================================================================================================");
        System.out.printf("Faturamento total: R$ %.2f \t| Produto mais faturado: %s \t| Total de vendas: %d |%n", fatTotal, prodMaiorFat, totalVendas);
        System.out.println("=========================================================================================================================");

    }
}