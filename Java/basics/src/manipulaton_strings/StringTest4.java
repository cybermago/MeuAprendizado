package manipulaton_strings;

public class StringTest4 {

	public static void main(String[] args) {
		//replace, toLowerCase - toUpperCase
		//trim,toCharArray,split
		String s1="   CFB Cursos - Curso de Java -";
		String s2="youtube.com/cfbcursos   ";
		String s3=s1.concat(s2);
		String s4;
		System.out.println(s3);
		
		//replace
		s4=s3.replace('C','@');
		System.err.println(s4);
		//toLowerCase/toupperCase
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		//trim
		System.out.println(s3.trim());
		//toCharArray
		char[] c=s3.toCharArray();
		System.out.println(c);
		//split
		String[] s5=s3.split(" ");
		for(String s: s5) {
			System.out.println(s);
		}
		
	}

}
