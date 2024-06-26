package vectors_and_arrays;

import java.util.Arrays;

public class ARRAYS {

	public static void main(String[] args) {

		// Exemplo 1: Declaração e inicialização de um array de inteiros
		int[] numeros = { 4, 2, 7, 1, 9, 5 };
		int[] b = { 1, 2, 3, 4 };
		int[] a;
		a = new int[3]; 
		a[0] = 100;
		
		System.out.println(a[2]);
		System.out.println(b[1]);
		System.out.println(b.length);
		
		
		// Exemplo 2: Acessando elementos do array e imprimindo-os
		System.out.println("Elementos do array:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();

		// Exemplo 4: Imprimindo o array ordenado
		System.out.println("Array ordenado:");
		for (int num : numeros) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}