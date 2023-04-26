package kr.hs.study.beans;

public class Test4 {
    int a;
    int b;
    int c;

     Test4(int a, int b, int c){
         this.a = a;
         this.b = b;
         this.c = c;
     }

     public void printEve(){
         System.out.println("짝수");
         if(a%2 == 0) System.out.println(a);
         if(b%2 == 0) System.out.println(b);
         if(c%2 == 0) System.out.println(c);
     }
}
