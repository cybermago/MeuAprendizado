package classes;

import java.security.PublicKey;

public class C {
	private final int maxvidas=3;
	private int num=0;
	private int vidas=3;
	static boolean alerta=false;
	static int qtdqj=0;
	static int pontosj=0;
	
	public C(int num) {
		this.num=num;
		this.vidas=1;
		// TODO Auto-generated constructor stub
		System.out.printf("Jogador %d criado%n", num);
		qtdqj++;
	}
	public int getVidas() {
		return this.vidas;
	}
	
	public void addVidas() {
		if (this.vidas < maxvidas) {
			this.vidas++;
		}
	}
	
	static void pontos() {
		pontosj+=10;
	}
	
	public void info() {
		System.out.printf("Nome:%d",this.num);
		System.out.printf("%nVidas:%d",this.vidas);
		System.out.printf("%nAlerta:%s",(alerta ? "sim":"não"));
		System.out.printf("%nJogadores:%d",qtdqj);
		System.out.printf("%nJogadores:%d",pontosj);
		System.out.printf("%n------------------%n");
	}
}
