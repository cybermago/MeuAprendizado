/**
 * 
 */
package basics;
import java.security.SecureRandom;
/**
 * 
 */
public class Mariz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LINHA=3;
		final int COLUNA=5;
		int[][] num = new int[LINHA][COLUNA];
		int[][] num2= {{10,20,30,40,50},{1,2,3,4,5},{100,200,300,400,500}};
		
		for(int l=0;l<LINHA;l++) {
			for(int c=0;c<COLUNA;c++) {
				num[l][c] = new SecureRandom().nextInt(100);
			}
		}
		/*for(int l=0;l<LINHA;l++) {
			for(int c=0;c<COLUNA;c++) {
				System.out.printf("%2d | ", num[l][c]);
			}
			System.out.printf("%n");
		}*/
		for(int[] n:num2) {
			for(int v:n) {
				System.out.printf("%3d | ", v);
			}
			System.out.print("%n");
		}	
	}
}