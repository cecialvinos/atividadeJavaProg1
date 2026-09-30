package dificil;

// Use arrays para produto, quantidade atual, estoque mínimo e preço unitário.
// Gere um relatório que informe quais itens precisam de reposição, o valor financeiro de cada estoque,
// o valor total armazenado e o produto com maior valor em estoque.
// Conte também quantos itens estão abaixo, iguais e acima do mínimo.

import java.util.Locale;

public class ControleEstoque {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String[] produtos = {"Abacaxi", "Banana", "Goiaba", "Morango"};
        int[] qntAtual = {44, 28, 33, 25};
        int[] estoqueMin = {25, 30, 33, 40};
        double[] precoUni = {3.59, 0.50, 1.50, 2.49};

        String itemReposicao = "";
        double valorEstoque = 0.00;
        double valorTotalArmazenado = 0.00;

        double maiorValorEstoque = qntAtual[0] * precoUni[0];
        String prodMaiorValEstoque = produtos[0];

        int qntAbaixo = 0;
        int qntIgual = 0;
        int qntAcima = 0;

        System.out.println("========================= RELATÓRIO ========================");

        for (int i = 0; i < qntAtual.length; i++) {

            if (qntAtual[i] < estoqueMin[i]) {
                itemReposicao += produtos[i] + " ";
            }

            valorEstoque = qntAtual[i] * precoUni[i];
            valorTotalArmazenado += valorEstoque;

            System.out.printf("Valor financeiro de %s: R$ %.2f%n", produtos[i], valorEstoque);

            if (valorEstoque > maiorValorEstoque) {
                maiorValorEstoque = valorEstoque;
                prodMaiorValEstoque = produtos[i];
            }

            if (qntAtual[i] > estoqueMin[i]) {
                qntAcima++;
            } else if (qntAtual[i] == estoqueMin[i]) {
                qntIgual++;
            } else {
                qntAbaixo++;
            }
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("Os itens que precisam de reposição: %s%n", itemReposicao);
        System.out.println("------------------------------------------------------------");
        System.out.printf("Valor total armazenado: R$ %.2f%n", valorTotalArmazenado);
        System.out.println("------------------------------------------------------------");
        System.out.printf("Produto de maior valor de estoque: %s (R$ %.2f)%n", prodMaiorValEstoque, maiorValorEstoque);
        System.out.println("------------------------------------------------------------");
        System.out.printf("Quantidade em estoque acima do mínimo: %d%n", qntAcima);
        System.out.printf("Quantidade em estoque igual do mínimo: %d%n", qntIgual);
        System.out.printf("Quantidade em estoque abaixo do mínimo: %d%n", qntAbaixo);
        System.out.println("------------------------------------------------------------");

    }
}
