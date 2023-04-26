package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("obj1: " + obj1);

        TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
        System.out.println("obj2: " + obj2);

        TestBean3 obj3 = ctx.getBean("t3", TestBean3.class);
        System.out.println("obj3: " + obj3);

        TestBean4 obj4 = ctx.getBean("t4", TestBean4.class);


        ctx.close();
        System.out.println("================================================");



        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 obj1_1 = ctx2.getBean("java1", TestBean1.class);
        System.out.println(obj1_1);

//        TestBean2 obj4 = ctx2.getBean("java2", TestBean2.class);
//        obj4.pr_Method();
//        System.out.println(obj4);

        TestBean2 obj2_2 = ctx2.getBean("a", TestBean2.class);
        System.out.println("TestBean obj2_2 : " + obj2_2);

        TestBean2 obj2_3 = ctx2.getBean("a", TestBean2.class);
        System.out.println("TestBean obj2_3 : " + obj2_3);

        TestBean3 obj3_3 = ctx2.getBean("java3", TestBean3.class);
        obj3_3.pr_Method2();

        ctx2.close();

    }
}