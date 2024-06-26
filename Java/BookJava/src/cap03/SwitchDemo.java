/**
 * 
 */
package cap03;

/**
 * Demostra SwitchDemo
 */
public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i=0; i<10; i++)
			switch (i) {
			case 0: {System.out.println("i is zero");
			}break;
			case 1: {System.out.println("i is one");
			}break;
			case 2: {System.out.println("i is two");
			}break;
			case 3: {System.out.println("i is three");
			}break;
			case 4: {System.out.println("i is four");
			}break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + i);
			}
	}

}
