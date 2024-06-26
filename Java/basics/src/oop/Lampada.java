/**
 * 
 */
package oop;

/**
 * 
 */
public class Lampada {
	private String led;
	private String fluorescente;
	private double voltagem;
	private float preço;
	private float potencia;
	private boolean status;
	/**
	 * 
	 */
	public Lampada() {
		// TODO Auto-generated constructor stub
	}
	public void setLed(String led) {
		this.led=led;
	}
	public void setFluorescente(String fluorescente) {
		this.fluorescente=fluorescente;
	}
	public void setVoltagem(double voltagem) {
		this.voltagem=voltagem;
	}
	public void setPreco(float preço) {
	this.preço=preço;
	}
	public void setPotencia(float potencia) {
		this.potencia=potencia;
	}
	public void setStatus(boolean status) {
		this.status=status;
	}
	//get
	public String getLed() {
		return led;	
	}
	public String getFlourescente() {
		return fluorescente;
	}
	public Double getVoltagem() {
		return voltagem;
	}
	public float getPreco() {
		return preço;
	}
	public float getPotencia() {
		return potencia;
	}
	public boolean getStatus() {
		return status;
	}
	
	public void acender() {
		status=true;
	}
	
	public void apagar() {
		status=false;
	}

}