package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean1 t1 = ctx.getBean(TestBean1.class);

        System.out.println(t1.getData1().getName());
        System.out.println(t1.getData1().getSpeed());
        t1.getData1().sayHi();

        System.out.println(t1.getData2().getName());
        System.out.println(t1.getData2().getSpeed());
        System.out.println(t1.getData2().getAge());
        t1.getData2().sound();
        t1.getData2().trainInfo();
    }
}