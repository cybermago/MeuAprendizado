/**
 * 
 */
package cap02;

/**
 * 
 */
public class VarInitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		for(x = 0; x < 3; x++) {
			int y = -1; // será inicializada senpre que entramos no bloco
			System.out.println("y is now:" + y);
			y = 100;
			System.out.println("y is now:" + y);
		}
	}

}
