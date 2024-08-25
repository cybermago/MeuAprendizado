/**
 * 
 */
package cap07;

import javax.management.loading.PrivateClassLoader;

/**
 * 
 */
public class TwoDShape {

	/**
	 * @param args
	 */
		// TODO Auto-generated method stub
		private double width;
		private double height;
		
		TwoDShape(double w, double h){
			width = w;
			height = h;
		}
		double getWidth() {return width;}
		double getHeight() {return height;}
		void setWidth(double w) {width = w;}
		void setHeight(double h) {height = h;}
		
		void showDim() {
			System.out.println("Width and height are"+width+"and"+height);
		}
	}

}
