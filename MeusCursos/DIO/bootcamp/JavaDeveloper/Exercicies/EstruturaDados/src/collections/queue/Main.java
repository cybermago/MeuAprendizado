package collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Queue<Carro> cars = new LinkedList<>();

        cars.add(new Carro("Ford"));
        cars.add(new Carro("Chevrolet"));
        cars.add(new Carro("Fiat"));
        cars.add(new Carro("Volksvagen"));
        cars.add(new Carro("Ferrari"));
        cars.add(new Carro("Audi"));
        cars.add(new Carro("Hiundai"));

        System.out.println(cars.add(new Carro("Pegeout")));
        System.out.println(cars);

        System.out.println(cars.offer(new Carro("Renout")));
        System.out.println(cars);

        System.out.println(cars.peek());
        System.out.println(cars);

        System.out.println(cars.poll());
        System.out.println(cars);

        System.out.println(cars.isEmpty());

        System.out.println(cars.size());

    }
}
