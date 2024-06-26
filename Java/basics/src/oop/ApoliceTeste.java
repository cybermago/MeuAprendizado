/**
 * 
 */
package oop;

import java.util.Scanner;

/**
 * 
 */
public class ApoliceTeste  extends Apolice{

	/**
	 * 
	 */
	public ApoliceTeste() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Apolice obj = new Apolice();
		
		System.out.println("Nome: ");
		obj.setNome(input.nextLine());
		
		System.out.println("Idade: ");
		obj.setIdade(input.nextInt());
		
		System.out.println("Premio: ");
		obj.setPremio(input.nextDouble());
		
		obj.imprimir();
		obj.calcular();
		
		System.out.println("Cidade: ");
		obj.setCidade(input.next());
		
		obj.desconto();
	}

}
