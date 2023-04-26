package kr.hs.study;

import kr.hs.study.beans.*;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(BeanConfig.class);
//        Cat c1 = ctx.getBean(Cat.class);
//        Dog d1 = ctx.getBean(Dog.class);
//        Rabbit r1 = ctx.getBean(Rabbit.class);
//
//        c1.eat(); c1.bark(); c1.move(); c1.sayHi();
//        d1.eat(); d1.bark(); d1.move(); d1.sayHi();
//        r1.eat(); r1.bark(); r1.move(); r1.sayHi();

        Taxi t1 = ctx.getBean(Taxi.class);
        Bus b1 = ctx.getBean(Bus.class);

        t1.start(); t1.stop(150);
        b1.start(); b1.stop(130);
    }
}