/**
 * 
 */
package cap04;

/**
 * Coleta de Lixo
 */
public class Finalize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		FDemo obDemo = new FDemo(0);
		for(count=1; count<10000; count++)
			obDemo.generator(count);
	}

}
