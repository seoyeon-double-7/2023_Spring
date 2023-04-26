package kr.hs.study.config;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfig {
//    kr.hs.study.beans 패키지 안에 '@'가 붙은 코드는
//    전부 bean으로 만들어서 컨테이너에 보관하라는 설정

    @Bean
    public DataBean2 java1(){
        return new DataBean2();
    }

    @Bean
    public DataBean2 java2(){
        return new DataBean2();
    }
}
