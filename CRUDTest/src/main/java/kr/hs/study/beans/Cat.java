package kr.hs.study.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cat implements Animal{
    private int age = 17;
    public  Cat(){

    }

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public void move() {
        System.out.println("고양이가 움직입니다.");
    }

    @Override
    public void eat() {
        System.out.println("고양이가 밥을 먹습니다.");
    }

    @Override
    public void bark() {
        System.out.println("미야옹");
    }

    public void sayHi(){
        System.out.println("나이는 " + age);
    }
}
