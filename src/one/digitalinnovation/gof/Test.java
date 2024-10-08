package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {

    public static void main(String[] args) {

        //Testes relacionados ao Design Pattern Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager .getInstancia();
        System.out.println(eager);
        eager =   SingletonEager .getInstancia();
        System.out.println(eager);


        SingletonLazyHolder lazyHolder = SingletonLazyHolder .getInstancia();
        System.out.println(lazyHolder);
        lazyHolder =   SingletonLazyHolder .getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento desensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo =  new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(desensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // FACADE

        Facade facade = new Facade();
        facade.migrarCliente("User", "123456");
    }
}
