/**
 * 
 */
package cap05;

/**
 * 
 */
public class ForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		
		for(int x:nums) {
			System.out.println("value"+x);
			sum+=x;
		}
		System.out.println("value"+sum);
	}

}
