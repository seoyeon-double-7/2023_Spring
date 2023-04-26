package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

// 이 파일은 객체를 만들어달라고 스프링에게 요청하는 설정파일이야 (●'◡'●)(❁´◡`❁)
@Configuration
public class BeanConfigClass {

    @Bean
    public TestBean1 java1(){   //메서드 이름이 객체이름
        TestBean1 t= new TestBean1();
        return t;
    }

    @Bean(name="a")
    @Scope("prototype")
    public TestBean2 java2(){
        return new TestBean2();
    }
    @Lazy
    @Bean
    public TestBean3 java3(){
        return new TestBean3();
    }

}
