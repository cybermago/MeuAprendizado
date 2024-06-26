/**
 * 
 */
package tests;

import java.io.IOException;

/**
 * 
 */
public class salario {

	/**
	 * 
	 */
	public salario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		float saldo=0;
		System.out.printf("seu salario: ");
		saldo = (float) System.in.read();
		float r=(saldo / 100+saldo);
		System.out.print(r);
	}

}
