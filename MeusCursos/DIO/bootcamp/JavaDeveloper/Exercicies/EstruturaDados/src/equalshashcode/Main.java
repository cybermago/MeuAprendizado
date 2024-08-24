package equalshashcode;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> liscars = new ArrayList<>();

        liscars.add(new Carro("Ford"));
        liscars.add(new Carro("Chevrolet"));
        liscars.add(new Carro("Volksvagen"));

        System.out.println(liscars.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());

        Carro car1 = new Carro("Ford");
        Carro car2 = new Carro("Chevrolet");

        System.out.println(car1.equals(car2));
    }
}
