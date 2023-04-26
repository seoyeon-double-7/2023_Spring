package kr.hs.study.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Train {
    private String name;
    private int speed;
    private int age;

    public Train(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public void sound(){
        System.out.println("폭폭");
    }
    public void trainInfo(){
        System.out.println(name + "기차가 달려갑니다.");
    }
}
