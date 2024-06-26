/**
 * 
 */
package basics;

/**
 * 
 */
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos=1;
		
		switch (pos) {
		case 1: {
			
			System.out.println("");
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + pos);
		}
				
	}

}
