package kr.hs.study.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Dog implements Animal{
    private int age = 17;

    public Dog(){

    }

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }

    @Override
    public void eat() {
        System.out.println("강아지가 사료를 먹습니다.");
    }

    @Override
    public void bark() {
        System.out.println("월월");
    }
    public void sayHi(){
        System.out.println("나이는 " + age);
    }
}
