package collections;

import java.util.HashMap;

public class CustomHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> carros = new HashMap<Integer, String>();
        carros.put(1, "Mustang");
        carros.put(2, "Ferrari");
        carros.put(3, "Lamborghini");
        carros.put(4, "Bugatti");
        carros.put(5, "Porche");
        carros.put(6, "Audi");
        carros.put(7, "BMW");
        carros.put(8, "Mercedes");
        carros.put(9, "Volkswagen");
        carros.put(10, "Toyota");
        carros.put(11, "Honda");
        carros.put(12, "Ford");
        carros.put(13, "Nissan");
        carros.put(14, "Hyundai");
        carros.put(15, "Kia");
        carros.put(16, "Renault");
        carros.put(17, "Chevrolet");
        carros.put(18, "Jeep");
        carros.put(19, "Citroen");
        carros.put(20, "Fiat");
        carros.put(21, "Peugeot");
        carros.put(22, "Dacia");
        carros.put(23, "Alfa Romeo");
        carros.put(24, "Subaru");
        carros.put(25, "Suzuki");
        carros.put(27, "Mitsubishi");

        System.out.println(carros);

        carros.remove(5);
        carros.clear();
        

        // System.out.println(carros.get(1));
        // for (int i = 0; i < carros.size() + 1; i++)
        // System.out.println(carros.get(i));
        // }
        for (String c : carros.values()) {
            System.out.println(c);
        }
    }
}
