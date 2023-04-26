package kr.hs.study.beans;

public class Test5 {
    int n1;

     Test5(int n1){
         this.n1 = n1;
     }

     public void printComp(){
         if((n1%10) == (n1/10))
             System.out.println("10의자리와 1의 자리가 같습니다.");
         else System.out.println("10의자리와 1의자리가 같지 않음");
     }
}
