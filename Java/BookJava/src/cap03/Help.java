/**
 * 
 */
package cap03;

/**
 * 
 */
public class Help {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Help on:");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.println("Choose one: ");
		
		choice = (char) system.in.read();
		
		switch(choice) {
		case '1':
			
			System.out.println("The if:\n");
			System.out.println("if(condition) statement;");
			System.out.println("else statement;");
			break;
			
		case '2':
			System.out.println("The switch:\n");
			System.out.println("switch(expression) {");
			System.out.println(" case constant:");
			System.out.println("   statemenet sequence");
			System.out.println("   break;");
			System.out.println(" // ...");
			System.out.println("}");
			break;
			
		default:
			System.out.println("Selection not found.");
		}
	}

}
