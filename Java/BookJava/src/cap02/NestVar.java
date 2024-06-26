/**
 * 
 */
package cap02;

/**
 * 
 */
public class NestVar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		
		for(count = 0; count < 10; count++) {
			System.out.println("This is count:");
		}
		int count; // invalid
			for(count = 0; count < 2; count++) {
				System.out.println("This program is in error!");
			}
	}
}