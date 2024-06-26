package collections;

import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue {
    public static void main(String[] args) {
        Queue<String> carros = new LinkedList<>();
        carros.add("Mustang");
        carros.add("Ferrari");
        carros.add("Lamborghini");
        carros.add("Bugatti");
        carros.add("Porche");
        System.out.println("Topo da Fila: " + carros.peek());
        System.out.println(carros);
        System.out.println("Topo:" + carros.poll());
        System.out.println(carros.isEmpty() ? "vazia" : "cheia");
    }
}
