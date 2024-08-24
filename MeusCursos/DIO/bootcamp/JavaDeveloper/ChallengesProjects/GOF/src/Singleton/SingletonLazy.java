package Singleton;
/**
 * Singleton
 * @author Jonata/
 */
public class SingletonLazy {
private static SingletonLazy instancy;

    private SingletonLazy(){
        super();
    }
    public static SingletonLazy getInstancy(){
        if(instancy == null){
            instancy = new SingletonLazy();
        }
        return instancy;
    }
}
