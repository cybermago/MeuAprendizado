/**
 * 
 */
package math;

/**
 * 
 */
public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = false;
		boolean y = true;
		
		boolean z = ((x && y) && (x || y) ) || (( true && y) && (false && x));
		System.out.println(z);
	}

}
