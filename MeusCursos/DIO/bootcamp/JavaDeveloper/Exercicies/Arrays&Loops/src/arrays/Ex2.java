package arrays;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdcon = 0;

                int i=0;
                do{
                    System.out.println("Letra: ");
                    String letra = sc.next();

                    if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                    consoantes[i] =letra;
                    qtdcon++;
                    }
                    i++;
                }while (i < consoantes.length);
                for(String consoante : consoantes){
                    if(consoante != null)
                    System.out.println(consoante);
                }
    }
}
