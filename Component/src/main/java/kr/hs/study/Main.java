package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean(TestBean1.class);
        TestBean2 obj2 = ctx.getBean(TestBean2.class);
        System.out.println(obj2.getData1());
        System.out.println(obj2.getData2());



    }
}