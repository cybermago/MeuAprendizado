/**
 * 
 */
package basics;
import java.util.Scanner;
/**
 * 
 */
public class Condicionais {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan=new Scanner(System.in);
				int a=0,b=0,c=0,soma=0;int faltas=0;int maxFaltas=0;int nota=85;
				final int media=60;String nome;
				String res;
				
				System.out.print("Digite o nome:");
				nome=scan.nextLine();
				System.out.print("Digite o 1 numero:");
				a=scan.nextInt();
				System.out.print("Digite o 2 numero:");
				b=scan.nextInt();
				System.out.print("Digite o 3 numero");
				c=scan.nextInt();
				System.out.print("faltas:");
				faltas=scan.nextInt();soma=a+b+c;
				
				res=(nota >= media ? "Aprovado": "Reprovado");
				System.out.println("Resultado "+ res);
				
	}
}