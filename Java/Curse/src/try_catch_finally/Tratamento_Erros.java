/**
 * 
 */
package try_catch_finally;
import java.util.ArrayList;
/**
 * 
 */
public class Tratamento_Erros {

	public static void main(String[] args) {
		
		
		int num1,num2,res;
		num1=50;
		num2=70;
		
		if(num1>50) {
			throw new IllegalArgumentException("valor de nota invalido");
		}
		if(num2>50) {
			throw new IllegalArgumentException("valor de nota invalido");
		}
		res=num1+num2;
		System.out.println("resultado:"+res);
		
	
		/*
		try {
			System.out.println(carros.get(10));
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("erro:"+e.getMessage());
		}finally {
			System.out.println("fim do tray");
		}
		*/
	}
}