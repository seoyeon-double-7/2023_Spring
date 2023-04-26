package kr.hs.study.beans;

public class TestBean1 {
    TestBean1(){
        System.out.println("Testbean의 기본생성자");
    }
    public void init_method(){
        System.out.println("TestBean1의 init_method 메소드");
    }

    public void destroy_method(){
        System.out.println("TestBean1의 destroy_method 메소드");
    }
}
