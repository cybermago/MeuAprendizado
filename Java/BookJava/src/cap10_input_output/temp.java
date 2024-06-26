/**
 * 
 */
package cap10_input_output;
import java.io.*;
/**
 * 
 */
public class temp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, j=0;
		
		if(args.length !=2) {
			System.out.println("usage:compfiles f1 f2");
			return;
		}
		//compara dois arquivos
		try(FileInputStream f1 = new FileInputStream(args[0]);
			FileInputStream f2 = new FileInputStream(args[1])) {
			//verifica o conteúdo de cada arquivo.
			do {
				i=f1.read();
				j=f2.read();
				if (i != j) break; 
				} while(i != -1 && j != -1);
			
			
				if (i != j) 
				System.out.println("Files differ.");
				else
				System.out.println("Files are the same.");
				} catch (IOException exc) {
				System.out.println("I/O Error: "+exc);
			}
		}
	}
