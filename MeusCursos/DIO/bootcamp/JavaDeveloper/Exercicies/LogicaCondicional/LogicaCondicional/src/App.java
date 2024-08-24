public class App {
    public static void main(String[] args) throws Exception {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println(b1 && b2);
        System.out.println(b1 && b3);

        System.out.println(b2 || b3);
        System.out.println(b2 || b4);

        System.out.println(b1 ^ b3);
        System.out.println(b4 ^ b1);

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 20f;
        System.out.println((i1 + i2) < (f2 - f1));
        System.out.println((i1 > i2) || (f2 < f1));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int qtdDependentes = 4;
        int mediaDependestes = 2;

        System.out.println((salarioMensal < mediaSalario) && (qtdDependentes >= mediaDependestes));


        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitoDependentes = qtdDependentes >= mediaDependestes;

        
        System.out.println((salarioBaixo) && (muitoDependentes));
    }
}
