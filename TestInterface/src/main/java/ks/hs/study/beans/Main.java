package ks.hs.study.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        HelloworldKr k1 = ctx.getBean("k1", HelloworldKr.class);
        k1.sayHi();

        HelloworldEn e1 = ctx.getBean("e1", HelloworldEn.class);
        e1.sayHi();

    }
}
