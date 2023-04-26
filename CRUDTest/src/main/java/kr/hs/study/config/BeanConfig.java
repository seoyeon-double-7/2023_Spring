package kr.hs.study.config;

import kr.hs.study.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfig {

    @Bean
    @Scope("prototype")
    public Cat c1(){
        Cat c1 = new Cat(18);
        return c1;
    }

    @Bean
    @Scope("prototype")
    public Dog d1(){
        Dog d1 = new Dog(17);
        return d1;
    }

    @Bean
    @Scope("prototype")
    public Rabbit r1(){
        Rabbit r1 = new Rabbit(16);
        return r1;
    }

    @Bean
    public Taxi t1() {
        return new Taxi(1500);
    }

    @Bean
    public Bus b1() {
        return new Bus(1500);
    }
}

