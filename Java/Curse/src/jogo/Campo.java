/**
 * 
 */
package jogo;

import java.security.PublicKey;

/**
 * 
 */
public class Campo {
	private char simbolo;
	/**
	 * 
	 */
	public Campo() {
		// TODO Auto-generated constructor stub
		
		public Campo(){
			this.simbolo=' ';
		}
		public char getSimbolo(){
			return this.simbolo;
		}
		public void setSimbolo(char simbolo) {
			if(this.simbolo=' ') {
				this.simbolo=simbolo;
			}else {
				System.out.println("campo já usado");
			}
		}
	}