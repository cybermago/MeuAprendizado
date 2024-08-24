package atribuicaoreferencia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = a;

        System.out.println(a + b);
        a = 2;
        System.out.println();

        Obj obj = new Obj(1);
        Obj obja = obj;

        System.out.println("obj"+obja+"obj"+obj);
        obja.setNum(2);
        System.out.println("obj"+obja+"obj"+obj);
    }
}