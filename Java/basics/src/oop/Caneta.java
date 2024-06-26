package oop;

class Caneta {
	
	private String marca;
	private String cor;
	private float tamanho;
	
	
	public void setCor(String cor) {
		this.cor=cor;	
	}
	
	public void setTamanho(float tamanho) {
		this.tamanho=tamanho;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getMarca() {
		return marca;
	}
	public float getTamanho() {
		return tamanho;
	}
	
}
