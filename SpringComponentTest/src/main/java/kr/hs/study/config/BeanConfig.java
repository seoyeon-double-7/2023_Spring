package kr.hs.study.config;

import kr.hs.study.beans.Car;
import kr.hs.study.beans.Train;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfig {

    @Bean
    public Car data1(){
        Car c1 = new Car("벤츠", 80);
        return c1;
    }
    @Bean
    public Train data2(){
        Train t1 = new Train("무궁화호", 5, 13);
        return t1;
    }
}
