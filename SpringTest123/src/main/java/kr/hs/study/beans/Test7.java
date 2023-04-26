package kr.hs.study.beans;

public class Test7 {
    int sNum;
    int s1;
    int s2;
    int s3;

     Test7(int sNum, int s1, int s2, int s3){
         this.sNum = sNum;
         this.s1 = s1;
         this.s2 = s2;
         this.s3 = s3;
     }

     public void printScore(){
         scoreComp(s1);
         scoreComp(s2);
         scoreComp(s3);
     }

     public void scoreComp(int score){
         int sco = score/10;
         if(sco >= 9)System.out.println("90점~ 100점");
         else if(sco >=8)System.out.println("80점~ 90점");
         else if(sco >=7)System.out.println("70점~ 80점");
         else System.out.println("0점~ 60점");
     }

}
