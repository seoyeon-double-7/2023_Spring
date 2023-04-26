package kr.hs.study.beans;

public class Test6 {
    int s1;
    int s2;
    int s3;

     Test6(int s1, int s2, int s3){
         this.s1 = s1;
         this.s2 = s2;
         this.s3 = s3;
     }

     public void printTri(){
         int max=0;
         int sum = s1+s2+s3;

         if(s1 > s2) max =s1;
         else if (s2<s1) max = s2;
         

         max = Math.max(s1, s2);
         max = Math.max(s3, max);
         sum -= max;
         

         if(sum >= max){
             System.out.println("삼각형 가능");
         }else System.out.println("삼각형 ㄴㄴ");

     }
}
