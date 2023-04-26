package kr.hs.study.bean;

public class Person {
    String name;
    int age;
    Job job;

    Person(String name, int age, Job job){
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void sayHi(){
        System.out.println("hi");
    }
}
