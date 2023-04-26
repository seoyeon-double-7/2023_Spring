package kr.hs.study;

import kr.hs.study.Beans.Jpop;
import kr.hs.study.Beans.Kpop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Kpop k1 = ctx.getBean("k1", Kpop.class);
//        System.out.println("kpop : " + k1);
        k1.sound();

        Jpop j1 = ctx.getBean("j1", Jpop.class);
//        System.out.println("jpop : " + j1);
        j1.sound();

        ctx.close();
    }
}