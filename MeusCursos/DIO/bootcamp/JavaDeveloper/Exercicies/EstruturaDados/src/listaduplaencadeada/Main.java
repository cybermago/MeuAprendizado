package listaduplaencadeada;

public class Main {
    public static void main(String[] args) {
    NoDuplamenteEncadeada<String> noduplo = new NoDuplamenteEncadeada<>();

    noduplo.add("a1");
    noduplo.add("a2");
    noduplo.add("a3");
    noduplo.add("a4");
    noduplo.add("a5");
    noduplo.add("a6");

    System.out.println(noduplo);
    noduplo.remove(3);
    noduplo.add(10,"99");
    }
}
