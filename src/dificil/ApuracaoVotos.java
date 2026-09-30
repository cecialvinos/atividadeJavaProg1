package dificil;

// Dado um array com códigos de votos (1, 2, 3 para candidatos; 0 branco; valores negativos anulados;
// 99 encerra a apuração), conte os votos com switch e condicionais. Calcule percentuais sobre votos
// válidos, identifique vencedor ou empate e exiba um resumo completo.

import java.util.Scanner;

public class ApuracaoVotos {

    public static void main(String[] args) {

        String[] nomeVotos = {"Lula", "Bolsonaro", "Renan", "Branco", "Encerrar"};
        int[] qntVotos = {1, 1, 2, 1, 3, 3, -2, 1, 2, 1, 0, 2, 1, -1, 0, -3, 1, 2, -2, 1, 3, 1, 2, 2, 1, 1, 1, 3, 1, 1, -1, -1, 3, 1, 2, 2, -2, 1, 99};

        int qnt1 = 0;
        int qnt2 = 0;
        int qnt3 = 0;
        int qnt0 = 0;

        int validos = 0;
        double porcValidos = 0;

        String vencedor = "";
        int maiorVoto = 0;

        for (int i = 0; i < qntVotos.length; i++) {

            switch (qntVotos[i]) {

                case 1:
                    qnt1++;
                    break;
                case 2:
                    qnt2++;
                    break;
                case 3:
                    qnt3++;
                    break;
                case 0:
                    qnt0++;
                    break;
                case 99:
                    break;
                default:
                    continue;
            }

            if (qntVotos[i] == 99) {
                continue;
            } else {
                validos++;
                porcValidos = (double) (qntVotos.length / validos) * 100;
            }
        }

        if (qnt1 > maiorVoto) {
            maiorVoto = qnt1;
        } else if (qnt2 > maiorVoto) {
            maiorVoto = qnt2;
        } else if (qnt3 > maiorVoto) {
            maiorVoto = qnt3;
        }

        if (maiorVoto == qnt1 || maiorVoto == qnt2 || maiorVoto == qnt3) {
            vencedor = "Empate";
        } else if (qnt1 > qnt2 && qnt1 > qnt3) {
            vencedor = nomeVotos[0];
        } else if (qnt2 > qnt1 && qnt2 > qnt3) {
            vencedor = nomeVotos[1];
        } else if (qnt3 > qnt2 && qnt3 > qnt1) {
            vencedor = nomeVotos[2];
        }

        System.out.printf("1 - Candidato Lula: %d votos%n", qnt1);
        System.out.printf("2 - Candidato Bolsonaro: %d votos%n", qnt2);
        System.out.printf("3 - Candidato Renan: %d votos%n", qnt3);
        System.out.printf("0 - Voto em branco: %d votos%n", qnt0);
        System.out.println();
        System.out.printf("Votos válidos: %.2f%%%n", porcValidos);
        System.out.println("Candidato vencedor: " + vencedor);
    }
}