package heranca;

public class Calculadora implements Operacao{

    @Override
    public void soma(double a, double b){
        System.out.println(a+b);
    }

    @Override
    public void multi(double a, double b){
        System.out.println(a*b);
    }
    @Override
    public void sub(double a, double b){
        System.out.println(a-b);
    }
    @Override
    public void div(double a, double b){
        System.out.println(a/b);
    }
}
