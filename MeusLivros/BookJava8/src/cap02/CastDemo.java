/**
 * 
 */
package cap02;

/**
 * 
 */
public class CastDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;
		i = (int) (x / y);
		
		System.out.print("Integer outcome of x / y: " + i);
		
		i = 100;
		b = (byte) i;
		System.out.print("value of b: " + b);
		
		i = 257;
		b = (byte) i;
		System.out.print("value of b: " + b);
		
		b = 88; // ascii for x
		ch = (char) b;
		System.out.println("ch: " + ch);
	}
	
}