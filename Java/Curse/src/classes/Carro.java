/**
 * 
 */
package classes;


/**
 * 
 */
public class Carro {
	private String nome;
	private boolean ligado;
	private boolean smash;
	private int blindagem;
	private boolean arm;
	
	public Carro(String nome) {
		this.nome=nome;
		this.ligado=false;
		this.smash=false;
		this.arm=false;
		this.blindagem=0;
	}
	public String getNome() {
		return this.nome;
	}
	public boolean getLigado() {
		return this.ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado=ligado;
	}
	public boolean getSmash() {
		return this.smash;
	}
	public void setSmash(boolean smash) {
		this.smash=smash;
	}
	public boolean getarm() {
		return this.arm;
	}
	public int getBlind() {
		return this.blindagem;
	}
	public void dano(int dano) {
		this.blindagem=dano;
		if(this.blindagem<=0) {
			this.blindagem=0;
			this.ligado=false;
			this.smash=true;
		}
	}
	public void info() {
		System.out.printf("Nome:%d",this.nome);
		System.out.printf("%nVidas:%d",this.ligado ? "sim":"não");
		System.out.printf("%nAlerta:%s",(smash ? "sim":"não"));
		System.out.printf("%nJogadores:%d",blindagem);
		System.out.printf("%nJogadores:%d",arm);
		System.out.printf("%n------------------%n");
	}
}
