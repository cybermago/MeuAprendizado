package Singleton;

public class SingletonEager {
    private static SingletonEager instancy = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonLazy getInstancy(){
        return instancy;
    }
}
