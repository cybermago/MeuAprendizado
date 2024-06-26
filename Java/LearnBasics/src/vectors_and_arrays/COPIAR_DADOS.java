package vectors_and_arrays;

import java.util.Arrays;

public class COPIAR_DADOS {
	
	public static void main(String[] args) {
		
		// Exemplo 1: Declaração e inicialização de um array de inteiros
		int[] numeros = { 4, 2, 7, 1, 9, 5 };
		
		// 1 FORMA//
		char[] c = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		char[] d = new char[7];
		System.arraycopy(c, 2, d, 0, 5);
		System.out.println(new String (d));
		
        // 2 FORMA //
		char[] f= {'a','b','c','d','e','f'};
		char[] copy = java.util.Arrays.copyOfRange(f, 2, 9);
		System.out.println(new String (copy));
		////

		// Exemplo 6: Copiando parte de um array para outro
		int[] novoArray = Arrays.copyOfRange(numeros, 1, 4);
		System.out.println("Novo array após cópia:");
		for (int num : novoArray) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
