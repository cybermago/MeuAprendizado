/**
 * 
 */
package classes;

/**
 * 
 */
public class Class_C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		
		C.pontos();
		C.pontos();
		C.pontos();
		
		 
		 C j1 = new C(++num);
		 C j2 = new C(++num);
		 C j3 = new C(++num);
		 C.alerta=true;
		 
	j1.info();
	j2.info();
	j3.info();
		 
		 //System.out.printf("%n%d",j1.getVidas());
		
		 
	}

}
