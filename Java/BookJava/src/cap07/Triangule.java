/**
 * 
 */
package cap07;

import java.text.NumberFormat.Style;

/**
 * 
 */
public class Triangule extends TwoDShape{

	/**
	 * @param args
	 */
	public Triangule(String s, double w, double h) {
		super(w, h);
		style = s;
	}
	double area() {
		return getWidth() * getHeight() / 2;
	}
	void showStyle() {
		System.out.println("Triangule is" + style);
	}

}
