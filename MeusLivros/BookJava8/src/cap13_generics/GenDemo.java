/**
 * 
 */
package cap13_generics;

/**
 * Classe Generica
 */
public class GenDemo {
	public static void main(String[] args) {
		Gen<Integer> iOb;
		
		
		//Cria um objeto Gen<Integer> e atribui sua
		//referencia a iob
		//autoboxing no capsulamento do valor 88 dentro de um objeto integer
		iOb = new Gen<Integer>(88);
		
		iOb.showType();
		
		int v = iOb.getob();
		System.out.println("value: "+v);
		
		Gen<String> strOb = new Gen<String>("Generics Test");
		
		strOb.showType();
		
		String string = strOb.getob();
		System.out.println("value"+str);
	}
}