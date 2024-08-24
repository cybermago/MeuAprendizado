package collections.list;

import collections.queue.Carro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
    List<Carro> cars = new ArrayList<>();

    cars.add(new Carro("Ford"));
    cars.add(new Carro("Chevrolet"));
    cars.add(new Carro("Fiat"));
    cars.add(new Carro("Pegeout"));
    cars.add(new Carro(""));

        System.out.println(cars.contains(new Carro("Fiat")));

        System.out.println("indice 2:" +cars.get(2));

        System.out.println(cars.indexOf(new Carro("Ford")));


        System.out.println(cars.remove(2));
        System.out.println(cars);
    }
}
