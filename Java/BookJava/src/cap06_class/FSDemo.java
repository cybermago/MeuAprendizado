/**
 * 
 */
package cap06_class;

/**
 * 
 */
public class FSDemo {

	/**
	 * 
	 */
	public FSDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;
		
		System.out.println("Fail quietly");
		
		for(int i=0; i < (fs.length * 2); i++)
			fs.put(i, i*10);
		for(int i=0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -1) System.out.print(x + "");
		}
		System.out.println("");
		
		system.out
	}

}
