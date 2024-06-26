/**
 * 
 */
package testnovidades;

import java.util.List;

/**
 * 
 */
public class SequencedCollections {

	/**
	 * 
	 */
	public SequencedCollections() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var arrayList = List.of(1,2,3,4,5);
		
//Antes - Java 17
var lastItemBefore = arrayList.get(arrayList.size()-1);
		
//Depois - Java 21
var lastItemAfter = arrayList.getLast();
System.out.println("Last:%d,%d%n", lastItemBefore, lastItemAfer);

	}
}