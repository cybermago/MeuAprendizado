package basic;

import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0; // Contador de valores positivos
        double soma = 0; // Soma dos valores positivos

        // Lê 6 valores e processa cada um deles
        for (int i = 0; i < 6; i++) {
            double x = leitor.nextDouble(); // Lê um valor do input

            if (x > 0) { // Verifica se o valor é positivo
                cont++; // Incrementa o contador de positivos
                soma += x; // Adiciona o valor à soma dos positivos
            }
        }

        double media = (cont > 0) ? soma / cont : 0; // Calcula a média dos valores positivos

        // Imprime a quantidade de valores positivos e a média
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));

        leitor.close(); // Fecha o scanner
    }
}
