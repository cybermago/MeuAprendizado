package intermediate;

import java.util.Scanner;

public class Quintanda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leitura das quantidades de morangos e maçãs
        double morangos = input.nextDouble();
        double macas = input.nextDouble();

        // Declaração dos preços por kg
        double precoMorango = morangos <= 5 ? 2.50 : 2.20;
        double precoMaca = macas <= 5 ? 1.80 : 1.50;

        // Cálculo do preço total
        double total = (morangos * precoMorango) + (macas * precoMaca);

        // Verificação das condições de desconto
        if ((morangos + macas) > 8 || total > 25.00) {
            total = total * 0.90; // Aplica 10% de desconto
        }

        if (total % 1 == 0) {
            System.out.printf("%.0f\n", total); // Se o número for inteiro, imprima sem decimais
        } else if (total * 10 % 1 == 0) {
            System.out.printf("%.1f\n", total); // Se o número tiver uma casa decimal significativa, imprima uma casa decimal
        } else {
            System.out.printf("%.2f\n", total); // Caso contrário, imprima duas casas decimais
        }

        input.close();

    }
}
