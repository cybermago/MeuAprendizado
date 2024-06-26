package oop;

public class CanetaTeste extends Caneta {
	
	public static void main(String[] args) {
		Caneta obj = new Caneta();
		obj.setMarca("bic");
		obj.setCor("red");
		obj.setTamanho(10);
		System.out.println(obj.getCor()+ "/" + obj.getMarca() + "/" + obj.getTamanho());
		
	}

}
