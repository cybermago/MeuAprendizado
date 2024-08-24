package subsystem;

public class Subsystem2 {
    private static Subsystem2 instancy = new Subsystem2();

    private Subsystem2(){
        super();
    }

    public static Subsystem2 getInstancy(){
        return instancy;
    }

    public String name(){
        return "Cidade";
    }
}
