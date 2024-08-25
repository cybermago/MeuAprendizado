/**
 * 
 */
package cap11_multhreading;

/**
 * 
 */
class MyThread extends Thread {

	/**
	 * @param args
	 */
	MyThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		start();
	}
	
	public void run() {
		System.out.println(getName()+"starting.");
	try {
		for(int count=0; count<10; count++) {
			Thread.sleep(400);
			System.out.println("In"+getName()+", count is"+count);
		}
	} catch (InterruptedException exc) {
		// TODO: handle exception
		System.out.println(getName()+"interrupted");
		}
	System.out.println(getName()+"terminating");
	}
	
	
	public class ExtendThread {
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
	
}