package loops;

import java.util.Scanner;

import static java.util.Locale.US;

public class Ex1_NomeIdade {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(US);

    String nome; int idade;


    while(true){
        System.out.println("Nome");
        nome = sc.next();
        if(nome.equals("0")) break;
        System.out.println("Idade");
        idade = sc.nextInt();
    }

    sc.close();
}

}
