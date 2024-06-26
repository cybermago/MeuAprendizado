/**
 * 
 */
package collections;
import java.util.ArrayList;
/**
 * 
 */
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		ArrayList<String> carros = new ArrayList<>();
		
		num.add(11);
		num.add(22);
		num.add(33);
		
		carros.add("BMW");
		carros.add("Gol");
		carros.add("Sandero");
		carros.add(1,"Argo");
		
		//1 carros.trimToSize();
		//2 carros.get(1));
		//3 carros.indexOf("Gol");
		//4 carros.remove(2);
		//5 carros.clear();
		
		for(int i=0;i<carros.size();i++) {
			System.out.println(carros.get(i));
		}
		for(int n:num) {
			System.out.println(n);
		}
		for(String e:carros) {
			System.out.println(e);
		}
	}
}