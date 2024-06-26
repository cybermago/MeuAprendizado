package vectors_and_arrays;

import java.util.Scanner;

import java.util.Arrays;
public class ARRAY_USUARIO {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Defina as dimensões do array multidimensional
        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        // Crie o array multidimensional sem valores atribuídos
        int[][] arrayMultidimensional = new int[linhas][colunas];

        // Preencha o array com valores digitados pelo usuário
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                arrayMultidimensional[i][j] = scanner.nextInt();
            }
        }

        // Imprima o array preenchido
        System.out.println("\nArray preenchido pelo usuário:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(arrayMultidimensional[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
		
	}
}
