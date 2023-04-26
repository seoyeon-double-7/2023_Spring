package kr.hs.study.beans;

public class Test1 {
    String a;
    String b;

    Test1(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public void chPrint(){
        System.out.println("첫번째 : " + b);
        System.out.println("첫번째 : " + a);
    }
}
