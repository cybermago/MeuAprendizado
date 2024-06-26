/**
 * 
 */
package basics;

/**
 * 
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int tam=5;
		int[] num = new int[5];
		num[0]=52;
		num[1]=100;
		num[2]=200;
		num[3]=300;
		num[4]=500;
		for(int i=0;i<num.length;++i) {
			System.out.printf("%d%n",num[i]);
		}
	}

}
