/**
 * 
 */
package cap02;

/**
 * 
 */
public class SideEffects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		i = 0;
		
		// i++ if
		if(false & (++i < 100))
			System.out.print("this");
		System.out.println("if executed:" + i); //
		
		//
		if(false && (++i < 100))
			System.out.println("this"); //
		System.out.println("if statement executed" + i); //
		
		
	}

}
