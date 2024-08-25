/**
 * 
 */
package cap13_generics;

/**
 * 
 */
public class Gen<T> {
	T ob;
	
	Gen(T o) {
		ob=o;
		// TODO Auto-generated constructor stub
	}
	T getob() {
		return ob;
	}
	
	void showType() {
		System.out.println("Type of T is "+ob.getClass().getName());
	}
}
