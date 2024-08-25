/**
 * 
 */
package cap10_input_output;

import java.io.IOException;

/**
 * 
 */
public class ReadBytes {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			byte data[] = new byte[10];
			System.out.println("Enter:");
			System.in.read(data);
			for(int i=0; i<data.length; i++)
				System.out.println((char) data[i]);
	}

}
