package manipulaton_strings;

public class StringTest {

	public static void main(java.lang.String[] args) {
//lenght, charAt e getChars
		
char[] texto_c={'c','u','r','s','o','j','a','v','a'};
		
		String texto_s = new String("CFB Cursos");
		
		int tam;char c;
		
		char[] texto_c2= new char[10];
		String s1 = new String();
		String s2 = new String(texto_s);
		String s3 = new String(texto_c);
		String s4 = new String(texto_c,0,5);
		
		
		//tam=texto_s.length();
		//System.out.println(tam);
		//c=texto_s.charAt(2);
		//System.out.println(c);
		//texto_s.getChars(4,10,texto_c,0);
		//System.out.println(texto_c2);	
	}
}
