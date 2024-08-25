/**
 * 
 */
package cap02;

/**
 * 
 */
public class PromDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		int i;
		
		b = 10;
		i = b * b; // certo
		
		b = 10;
		b = (byte) (b * b);
		System.out.println("i and b: " + i + "" + b);
		}
}
