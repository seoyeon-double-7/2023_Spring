package kr.hs.study.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Car {
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void sayHi(){
        System.out.println("Hi");
    }
}
