/**
 * 
 */
package cap12;

/**
 * 
 */
public class Annotations {

	
	@interface MyAnno{
		String str();
		int val();
	}
	@MyAnno(str = "Annotation Example", val=100)
	public static void myMeth() {
		
	}
}
