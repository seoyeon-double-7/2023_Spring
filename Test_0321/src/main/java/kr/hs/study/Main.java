package kr.hs.study;

import kr.hs.study.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Person obj1 = ctx.getBean("p1", Person.class);

        System.out.println("obj1 : " + obj1);
        obj1.sayHi();

        ctx.close();
    }
}