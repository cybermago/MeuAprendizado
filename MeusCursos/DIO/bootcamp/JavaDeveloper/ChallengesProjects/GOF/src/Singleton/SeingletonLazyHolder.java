package Singleton;

public class SeingletonLazyHolder {

    private static class SingletonHolder {
        public static SingletonHolder intancy = new SingletonHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancy(){
        return InstanceHolder.instancy;
    }
}
