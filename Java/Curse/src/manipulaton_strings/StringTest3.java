/**
 * 
 */
package manipulaton_strings;

/**
 * 
 */
public class StringTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//startswidth / endsWidth,indexOf,substring,concat
		
		// TODO Auto-generated method stub
		String s1="CFB Cursos - Curso de Java";
		String s2="Caixa";
		System.out.println(s1);
		
		//startsWidth
		if(s1.startsWith("CFBA")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//endsWidth
		if(s1.endsWith("Java")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		//indexOF
		System.out.println(s1.indexOf('C',1));
		//substring
		System.out.println(s1.substring(4,18));
		//concat
		System.out.println(s1.concat(s2));
	}

}
