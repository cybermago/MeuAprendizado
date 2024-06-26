package manipulaton_strings;

public class StringTest2 {

	public static void main(String[] args) {
//equals, equalsIgnoreCase, CompareTo, RegionMatches
		String s4 = new String("Jonata");
		String s1 = "Curso de Java";
		String s2 = "CFBCursos";
		String s3 = "CFBCurso de Java";
		String s5 = "Jonata";
		String s6 = "jonata";
		
		
		//equals vs ==
		if(s1.equals(s2)) {
			System.out.println("s1 diferente s2");
		}else {
			System.out.println("s1 diferente s2");
		}
		//equalsIgnoreCase
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 diferente s2");
		}else {
			System.out.println("s1 diferente s2");
		}
		//compareTo
		int res=s3.compareTo(s6);
		System.out.println(s1.compareTo(s2));

		//regionMatches
		if(s4.regionMatches(true,0,s5,0,3)) {
			System.out.println("s4 diferente s5");
		}else {
			System.out.println("s4 diferente s5");
		}
		
	}

}
