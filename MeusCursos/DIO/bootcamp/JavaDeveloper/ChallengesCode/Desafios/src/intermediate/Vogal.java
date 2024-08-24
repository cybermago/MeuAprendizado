package intermediate;

import java.util.Scanner;

public class Vogal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int espacosEmBranco = 0;
        int quantVogais = 0;

        // Converter a string para minúsculas para facilitar a contagem de vogais
        str = str.toLowerCase();

        // Percorrer cada caractere na string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Verificar se o caractere é um espaço em branco
            if (ch == ' ') {
                espacosEmBranco++;
            }

            // Verificar se o caractere é uma vogal
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                quantVogais++;
            }
        }

        // Imprimir o resultado
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}
