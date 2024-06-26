/**
 * 
 */
package cap03;
import java.io.IOException;
/**
 * 
 */
public class KbIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throws java.io.IOException {
			char ch;
			System.out.print("Press a key followed by ENTER:");
			ch = (char) System.in.read();
			System.out.print("Your key:"+ch);
		}
	}

}
