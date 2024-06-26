/**
 * 
 */
package tests;
import java.io.IOException;
/**
 * 
 */
public class test1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a,m,d;
		System.out.print("quantos anos voce tem?: ");
		a = (int)  System.in.read();
		
		System.out.print("quantos meses voce tem?: ");
		m = (int)  System.in.read();
		
		System.out.print("quantos dias voce tem?: ");
		d = (int)  System.in.read();
		
		int r=365*a;
		int r2=30*m;
		int r3=r+r2+d;
		System.out.printf("voce tem: "+r3+" dias de vida");
		
	}

}
