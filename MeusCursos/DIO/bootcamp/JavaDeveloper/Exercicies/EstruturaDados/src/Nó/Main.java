package Nó;

public class Main {
    public static void main(String[] args) {
        Nó<String> no1 = new Nó<>("no1");

        Nó<String> no2 = new Nó<>("no2");
        no1.setProximoNo(no2);

        Nó<String> no3 = new Nó<>("no3");
        no2.setProximoNo(no3);

        Nó<String> no4 = new Nó<>("no4");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);
        System.out.println("-------------------");
        System.out.println(no1);
        System.out.println(no1.getProximoNo().getProximoNo());
    }
}
