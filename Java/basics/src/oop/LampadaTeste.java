package oop;

import java.io.IOException;

public class LampadaTeste extends Lampada{

	public LampadaTeste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Lampada obj = new Lampada();
		Lampada obj2 = new Lampada();
		obj.setFluorescente("sim");
		obj.setLed("sim");
		obj.setPotencia(135);
		obj.setPreco(40);
		obj.setStatus(true);
		obj.setVoltagem(1.5);
		//
		obj2.setFluorescente("não");
		obj2.setLed("sim");
		obj2.setPotencia(140);
		obj2.setPreco(55);
		obj2.setStatus(false);
		obj2.setVoltagem(1.10);
		
		if (obj.getPotencia() > obj2.getPotencia() && obj.getPreco() > obj2.getPreco()) {
			System.out.println(obj.getPotencia() + "/" + obj.getPreco());
		}else {
			System.out.println(obj2.getPotencia() + "/" + obj2.getPreco());
		}
	}

}
