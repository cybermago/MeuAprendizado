package collections.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Carro> carros = new HashSet<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Fiat"));
        carros.add(new Carro("Renault"));
        carros.add(new Carro("Pegeout"));
        carros.add(new Carro("Zip"));
        carros.add(new Carro("Alfa Romeu"));


        System.out.println(carros);

        Set<Carro> carrostree = new TreeSet<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Fiat"));
        carros.add(new Carro("Renault"));
        carros.add(new Carro("Pegeout"));
        carros.add(new Carro("Zip"));
        carros.add(new Carro("Alfa Romeu"));

        System.out.println(carrostree);
    }
}