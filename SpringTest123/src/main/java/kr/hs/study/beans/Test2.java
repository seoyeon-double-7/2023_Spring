package kr.hs.study.beans;

public class Test2 {
    int n1;
    int n2;
    int n3;
    
    Test2(int n1, int n2, int n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    
    public void printSumAvg(){
        int sum = n1+n2+n3;
        double avg = sum/3;
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
    }
    
}
