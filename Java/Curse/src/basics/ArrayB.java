/**
 * 
 */
package basics;
import java.security.PublicKey;
import java.security.SecureRandom;
/**
 * 
 */
public class ArrayB {

	/**
	 * 
	 */
	public ArrayB() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int linha=3;
		final int coluna=5;
		int[][] num=new int[3][5];
		
		gerDados(num, linha, coluna);
		impdados(num, linha, coluna);
	}
		
public static void gerDados(int[][] mtz, int linhas, int colunas) {
for(int l=0;l<linhas;l++) {
	for(int c=0;c<colunas;c++) {
		mtz[l][c]=new SecureRandom().nextInt(100);			
		}
	}
}
	public static void impdados(int[][] mtz, int linhas, int colunas) {
		for(int l=0;l<linhas;l++) {
			for(int c=0;c<colunas;c++) {
			System.out.printf("%d -",mtz[l][c]);
			}
			System.out.printf("%n");
		}
	}
}
