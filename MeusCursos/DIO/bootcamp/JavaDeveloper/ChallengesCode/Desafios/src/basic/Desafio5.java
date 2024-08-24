package basic;

import java.io.IOException;
import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;

        for (int i = 1; i <= N; i++) {
            if (i == N) {
                System.out.print(anterior + " "); // Imprime o último valor sem espaço após ele
            } else {
                System.out.print(anterior + " "); // Imprime os valores seguidos por um espaço
            }

            // Atualiza os valores para a próxima iteração
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        }
    }