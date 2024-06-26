/**
 * 
 */
package collections;

import java.util.Stack;

/**
 * 
 */
public class CustomStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> carros = new Stack<>();
		carros.push("Golf");
		carros.push("Camaro");
		carros.push("Tiago");
		carros.push("Cam");

		System.out.println("Topo da Pilha:" + carros.peek());
		System.out.println("Topo da Pilha:" + carros.pop());
		System.out.println(carros.empty() ? "Pilha vazia" : "Pilha cheia");
		System.out.println("Pilha:" + carros);
		carros.clear();
		System.out.println("Pilha Deletada:" + carros);

	}
}
