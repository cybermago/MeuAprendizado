package estrutura;

public class Main {
    public static void main(String[] args) {
        Carro car = new Carro();

        car.setAno(10);
        car.setCor("Red");
        car.setMarca("Fiat");
        car.setModelo("Fiat Uno");

        System.out.println(car.toString());

        Carro car2 = new Carro();
    }
}
