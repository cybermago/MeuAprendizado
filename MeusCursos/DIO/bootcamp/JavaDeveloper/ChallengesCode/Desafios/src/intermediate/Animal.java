package intermediate;
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animal {

    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1,AN2,AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();



        Map<String, String> animals = new HashMap<>();


        animals.put("vertebrado-ave-carnivoro", "aguia");
        animals.put("vertebrado-ave-onivoro", "pomba");
        animals.put("vertebrado-mamifero-onivoro", "homem");
        animals.put("vertebrado-mamifero-herbivoro", "vaca");
        animals.put("invertebrado-inseto-hematofago", "pulga");
        animals.put("invertebrado-inseto-herbivoro", "lagarta");
        animals.put("invertebrado-anelideo-hematofago", "sanguessuga");
        animals.put("invertebrado-anelideo-onivoro", "minhoca");

        String key = AN1 + "-" + AN2 + "-" + AN3;

        System.out.println(animals.get(key));

        sc.close();

        //TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
        //Dica: Você pode utilizar o método equals para realizar comparações.
    }
}