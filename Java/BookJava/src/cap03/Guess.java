package cap03;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throws java.io.IOException{
			
			char ch, answer = 'K';
			
			System.out.println("'m thinking of a letter betwenn A and Z.");
			System.out.print("Can you guess it: ");
			
			ch = (char) System.in.read(); //
			
			if(ch ==answer) System.out.print("** Right **");
		}
	}

}
