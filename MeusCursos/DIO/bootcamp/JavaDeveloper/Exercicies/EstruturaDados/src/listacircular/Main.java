package listacircular;

public class Main {

    public static void main(String[] args) {
        ListaCircular<String> lc = new ListaCircular<>();


        lc.add("a0");
        System.out.println(lc);
        lc.remove(0);
        System.out.println(lc);
        lc.add("c1");
        System.out.println(lc);
        lc.add("c2");
        lc.add("c3");
        System.out.println(lc);
        System.out.println(lc.get(0));
        System.out.println(lc.get(1));
        System.out.println(lc.get(2));
        System.out.println(lc.get(3));

        System.out.println("\n/**********/");
        for(int i=0; i< 10; i++){

            System.out.println(lc.get(i));
        }

    }
}
