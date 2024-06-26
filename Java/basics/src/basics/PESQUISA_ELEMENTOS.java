package basics;

import java.util.Arrays;

public class PESQUISA_ELEMENTOS {

	public static void main(String[] args) {
		
		// Exemplo 1: Declaração e inicialização de um array de inteiros
		int[] numeros = { 4, 2, 7, 1, 9, 5 };
		// Exemplo 5: Procurando um elemento no array
		int elementoProcurado = 7;
		int indice = Arrays.binarySearch(numeros, elementoProcurado);
		if (indice >= 0) {
			System.out.println("Elemento " + elementoProcurado + " encontrado no índice " + indice);
		} else {
			System.out.println("Elemento " + elementoProcurado + " não encontrado no array");
		}
	}
	
}
