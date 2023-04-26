package kr.hs.study.beans;

public class Test8 {
    int sNum;
    int s1;
    int s2;
    int s3;

    Test8(int sNum, int s1, int s2, int s3){
        this.sNum = sNum;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void printMaxMin(){
        int max=0;
        int min=10000;

        max = Math.max(s1, s2);
        max = Math.max(s3, max);

        min = Math.min(s1, s2);
        min = Math.min(s3, min);

        System.out.println("최대 : "+max + "점");
        System.out.println("최소 : "+min + "점");

    }
}
