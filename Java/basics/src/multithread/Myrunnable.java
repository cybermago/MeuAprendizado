/**
 * 
 */
package multithread;

/**
 * 
 */
public class Myrunnable implements Runnable{
	
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name);
	}
}
