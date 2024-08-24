public class Minhaclasse {

public static void main(String[] args) {
    // Instanciar uma classe
    System.out.println("Hello world");

    int ano = 2024;
    final String BR = "Brasil";
    String nome$ = "João";
    boolean verdadeiro = true;
    String primeiroNome = "A";
    String segundoNome = "B";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);


 }

 public static String nomeCompleto(String primeiroNome, String segundoNome){
        //return primeiroNome.concat(segundoNome);    
        return "resultado" + primeiroNome.concat(" ").concat(segundoNome);
 }

}
