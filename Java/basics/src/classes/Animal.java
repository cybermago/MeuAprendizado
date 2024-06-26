/**
 * 
 */
package classes;

/**
 * 
 */
public class Animal implements SerVivo{

	/**
	 * 
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public void mover() {}
	public void comer() {}
	public void info() {
		System.out.printf("Vivo:%s%n",this.vivo ?"sim":"não");
	}
	
}
