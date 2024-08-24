import Strategy.Facade;

public class Test {
    public static void main(String[] args) {
        // - singleton
/*
        SingletonLazy lazy = SingletonLazy.getInstancy();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancy();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancy();
        System.out.println(eager);
        eager = SingletonEager.getInstancy();
        System.out.println(eager);

        SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancy();
        System.out.println(lazyholder);
        lazyholder = SingletonLazyHolder.getInstancy();
        System.out.println(lazyholder);
*/
        // - Strategy
    /*
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        */

        // - Facade

        Facade facade = new Facade();
        facade.migrar("jonata","65415000");
    }
}
