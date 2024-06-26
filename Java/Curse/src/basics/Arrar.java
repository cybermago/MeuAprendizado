/**
 * 
 */
package basics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 */
public class Arrar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=10;
		int[] num = {2,2,5,2,4,5,2,4,7,3,5};
		int[] num2 = new int[tam];
		int p=-15;
		int pos;
		
		
		//Arrays.fill(num2, 10);
		//System.arraycopy(num, 0, num2, 0, tam);
		Arrays.sort(num);
		
		pos=Arrays.binarySearch(num, p);
		System.out.printf("o elemento %d esta no array?:%s na posição %d",p,pos > 0 ? "sim" : "não");
		
		//for(int n:num2) {
			//System.out.printf("%d", n);
		}
	}
