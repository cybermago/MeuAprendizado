package collections.stack;
import java.util.Stack;
public class Main {

    public static void main(String[] args) {
        Stack<Carro> cars = new Stack<>();

        cars.push(new Carro("Ford"));
        cars.push(new Carro("Ford"));
        cars.push(new Carro("Ford"));

        System.out.println(cars);
        System.out.println(cars.pop());
        System.out.println(cars);

        System.out.println(cars.peek());
        System.out.println(cars);
    }
}
