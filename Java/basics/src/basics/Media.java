package basics;

import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=0,b=0,c=0,soma=0;
		final int MEDIA=60;
		String nome="",res="";
		
		System.out.print("Digite o nome:");
		nome=scan.nextLine();
		System.out.print("Digite o 1 numero:");
		a=scan.nextInt();
		System.out.print("Digite o 2 numero:");
		b=scan.nextInt();
		System.out.print("Digite o 3 numero");
		c=scan.nextInt();
	    soma=a+b+c;
	    if(soma >= MEDIA) {
	    	res="aprovado";
	    }else if(soma>=40){
	    	res="recuperacao";
	    }else {
	    	res="reprovado";
	    }
		System.out.printf("aluno %s foi %s , com nota %d",nome,res,soma);

		}

	}