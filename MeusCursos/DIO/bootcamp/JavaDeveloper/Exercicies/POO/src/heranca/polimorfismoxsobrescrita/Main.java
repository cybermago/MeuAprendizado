package heranca.polimorfismoxsobrescrita;

public class Main {
    public static void main(String[] args) {
        Mae[] classes = new Mae[]{new Filho1(), new Filho2(), new Mae()};

        //Sobrescrita + polimorfismo
        for(Mae classe: classes){
            classe.metodo1();
        }
        System.out.println("");

        for(Mae classe: classes){
            classe.metodo2();
        }
        System.out.println("");

        //Sobrescrita
        Filho2 classeFilho2 = new Filho2();
        classeFilho2.metodo2();

    }
}