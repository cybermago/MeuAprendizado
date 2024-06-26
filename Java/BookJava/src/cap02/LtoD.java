/**
 * 
 */
package cap02;

/**
 * casting Long to Double
 */
public class LtoD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long L;
		double D;
		
		L = 10012345L;
		D = L; //convertendo long para double
		
		System.out.print("L and D:" + L + "" + D);
		
		D = 10012345.0;
		L = D; //invalido
		System.out.print("L and D:" + L + "" + D);
	}

}
