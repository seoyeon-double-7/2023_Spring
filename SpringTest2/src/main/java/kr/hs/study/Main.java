package kr.hs.study;

import kr.hs.study.beans.Test1;
import kr.hs.study.beans.Test2;
import kr.hs.study.beans.Test3;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Test1 obj1 = ctx.getBean("t1", Test1.class);
        System.out.println(obj1.sumT1());

        Test2 obj2 = ctx.getBean("t2", Test2.class);
        obj2.printEven();

        Test3 obj3 = ctx.getBean("t3", Test3.class);
        obj3.print();

        ctx.close();


        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfig.class);

        Test1 obj1_2 = ctx2.getBean("java1", Test1.class);
        System.out.println(obj1_2.sumT1());

        Test2 obj2_2 = ctx2.getBean("java2", Test2.class);
        obj2_2.printEven();

        Test3 obj3_2 = ctx2.getBean("java3", Test3.class);
        obj3_2.print();



        ctx2.close();


    }
}