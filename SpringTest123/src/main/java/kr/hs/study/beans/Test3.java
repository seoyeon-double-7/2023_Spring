package kr.hs.study.beans;

public class Test3 {
    int a;
    int b;

     Test3(int a, int b){
         this.a = a;
         this.b = b;
     }

     public void printComp(){
         if(a>b) System.out.println(1);
         else if(a<b) System.out.println(0);
         else if(a == b) System.out.println(a + "== " + b);
     }
}
