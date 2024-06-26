/**
 * 
 */
package cap11_multhreading;

import java.util.Iterator;

/**
 * 
 */
public class ExtendThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new Mythread("Child #1");
		
		for (int i = 0; i < 50; i++) {
			System.out.println(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				// TODO: handle exception
				System.out.println("main thread interrupted.");
			}
		}
		System.out.println("Main thread ending.");
	}
}