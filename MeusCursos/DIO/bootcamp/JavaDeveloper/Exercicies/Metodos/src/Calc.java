import java.io.IOException;

public class Calc {
    public static int a,b;

    public static boolean soma(int a, int b){
        double soma=a+b;
        System.out.println(soma);
        return false;
    }
    public static boolean sub(int a, int b){
        double sub=a-b;
        System.out.println(sub);
        return false;
    }
    public static boolean multi(int a, int b){
        double multi=a*b;
        System.out.println(multi);
        return false;
    }
    public static boolean div(int a, int b){
        double div=a/b;
        System.out.println(div);
        return false;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(Calc.soma(5,2));
        System.out.println(Calc.multi(5,2));
        System.out.println(Calc.sub(5,2));
        System.out.println(Calc.div(5,2));

    }
}
