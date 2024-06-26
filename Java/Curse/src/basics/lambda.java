package basics;

import java.util.function.Consumer;
import java.util.ArrayList;

public class lambda {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> dobro = new ArrayList<Integer>();
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        // Consumer<Integer> dobrar = (v) -> {dobro.add(v * 2);};
        // num.forEach(dobrar);
        num.forEach((v) -> {
            dobro.add(v * 2);
        });

        System.out.println(num);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);
    }
}
