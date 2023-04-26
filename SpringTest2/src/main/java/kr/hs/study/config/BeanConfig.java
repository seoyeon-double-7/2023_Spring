package kr.hs.study.config;

import kr.hs.study.beans.Test1;
import kr.hs.study.beans.Test2;
import kr.hs.study.beans.Test3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Test1 java1(){
        Test1 t = new Test1();
        t.setM(10);
        t.setN(1);
        return t;
    }

    @Bean
    public Test2 java2(){
        Test2 t2 = new Test2();
        t2.setInput("e");
        t2.setN(10);

        return t2;
    }

    @Bean
    public Test3 java3(){
        Test3 t3 = new Test3();
        t3.setInput(1);
        t3.setR(5);

        return t3;
    }

}
