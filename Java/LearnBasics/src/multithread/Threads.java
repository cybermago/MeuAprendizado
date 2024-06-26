/**
 * 
 */
package multithread;

/**
 * 
 */
public class Threads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		Myrunnable myrunnable = new Myrunnable();
		
		//nova thread
		Thread t1 = new Thread(new Myrunnable());
		t1.run(); //apenas na mesma thread
		t1.start();//mesma thread
		
		Thread t2 = new Thread(
				() -> System.out.println(Thread.currentThread().getName()));
		t2.start();
		
		Thread t3 = new Thread(myrunnable);
		t3.start();
	}
}