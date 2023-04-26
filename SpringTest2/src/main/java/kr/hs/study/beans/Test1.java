package kr.hs.study.beans;

public class Test1 {
    int n, m;

    public Test1(){

    }
    public Test1(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int sumT1(){
        int sum=0;
        for(int i=n; i<=m; i++){
            sum+=i;
        }
        return sum;
    }
}
