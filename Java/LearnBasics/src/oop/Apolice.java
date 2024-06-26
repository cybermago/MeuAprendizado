/**
 * 
 */
package oop;

/**
 * 
 */
public class Apolice {
	private static String nome;
	private static int idade;
	private static double premio;
	private static String cidade;
	
	public static void imprimir() {
		System.out.printf("%s /  %d / %f",nome,idade,premio);
	}
	
	public static int getIdade() {
		return idade;
	}
	public static String getNome() {
		return nome;
	}
	public static double getPremio() {
		return premio;
	}
	public static String getCidade() {
		return cidade;
	}
	public static void setCidade(String cidade) {
		Apolice.cidade = cidade;
	}
	public static void setIdade(int idade) {
		Apolice.idade = idade;
	}
	public static void setNome(String nome) {
		Apolice.nome = nome;
	}
	public static void setPremio(double premio) {
		Apolice.premio = premio;
	}
	
	public static void calcular(){
		if(idade>=18 && idade<= 25) {
			premio+=(premio*20)/100;
			System.out.println(idade);
		}else {
			if(idade>25 && idade<=26) {
				premio+=(premio*15)/100;
				System.out.println(idade);
			}else {
				premio+=(premio*10)/100;
				System.out.println(idade);
			}
		}
	}
	
	public static void desconto() {
		if(cidade == "Curitiba") {
			premio+=(premio/100)*20;
			System.out.println(cidade);
		}else {
			if(cidade == "Rio de Janeiro") {
				premio+=(premio/100)*15;
				System.out.println(cidade);
			}else {
				if(cidade == "São Paulo") {
					premio+=(premio/100)*10;
					System.out.println(cidade);
				}else {
					if(cidade == "Belo Horizonte") {
						premio+=(premio/100)*5;
						System.out.println(cidade);
					}
				}
			}
		}
	}
	/**
	 * 
	 */
	public Apolice() {
		// TODO Auto-generated constructor stub
	}
}
