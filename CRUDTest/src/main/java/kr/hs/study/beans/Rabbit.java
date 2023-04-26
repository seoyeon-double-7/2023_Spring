package kr.hs.study.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Rabbit implements Animal{
    private int age = 17;

    public Rabbit(){

    }

    public Rabbit(int age) {
        this.age = age;
    }

    @Override
    public void move() {
        System.out.println("토끼가 움직입니다.");
    }

    @Override
    public void eat() {
        System.out.println("토끼가 밥을 먹습니다.");
    }

    @Override
    public void bark() {
        System.out.println("토끼가 짖습니다.");
    }

    public void sayHi(){
        System.out.println("나이는 " + age);
    }
}
