package kr.hs.study.beans;

public class Test3 {
    private int input;
    private int r;

    public Test3(){

    }

    public Test3(int input, int r) {
        this.input = input;
        this.r = r;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void print(){
        if(input == 0) {System.out.println("종료");}
        else if(input == 1){
            System.out.println("원의 넓이 : " +  (r*r*3.14));
            System.out.println("원의 둘레 : " +  (2*r*3.14));
        }else if(input == 2){
            System.out.println("정사각형의 넓이 : " +  (r*r));
        }

    }
}
