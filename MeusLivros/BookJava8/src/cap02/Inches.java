package cap02;
/**
 * Calcula quantas polegadas cúbicas há em 
 * uma milha cúbica
 */

/**
 * 
 */
public class Inches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long ci;
		long im;
		
		im=5280*12;
		ci=im*im*im;
		
		System.out.println("There are " + ci + 
				"cubic inches in cubic mile.");
	}

}
