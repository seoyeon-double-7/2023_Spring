package kr.hs.study;

import kr.hs.study.beans.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

//       1번
        Test1 obj1 = ctx.getBean("t1", Test1.class);
        obj1.chPrint();
        System.out.println("---------------------------------");
//        2번
        Test2 obj2 = ctx.getBean("t2", Test2.class);
        obj2.printSumAvg();
        System.out.println("---------------------------------");

//        3번
        Test3 obj3 = ctx.getBean("t3", Test3.class);
        obj3.printComp();
        System.out.println("---------------------------------");

//        4번
        Test4 obj4 = ctx.getBean("t4", Test4.class);
        obj4.printEve();
        System.out.println("---------------------------------");

//        5번
        Test5 obj5 = ctx.getBean("t5", Test5.class);
        obj5.printComp();
        System.out.println("---------------------------------");

//        6번
        Test6 obj6 = ctx.getBean("t6", Test6.class);
        obj6.printTri();


//        7번
        Test7 obj7 = ctx.getBean("t7", Test7.class);
        obj7.printScore();
        System.out.println("---------------------------------");


//        8번
        Test8 obj8 = ctx.getBean("t8", Test8.class);
        obj8.printMaxMin();
        System.out.println("---------------------------------");

//        9번
        Test9 obj9 = ctx.getBean("t9", Test9.class);
        obj9.printMaxMin();






        ctx.close();

    }
}