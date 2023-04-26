package kr.hs.study.beans;

public class Test2 {
    private String input;
    private int n;

    public Test2(){

    }

    public Test2(String input, int n) {
        this.input = input;
        this.n = n;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void printEven(){
        if(input == "o"){
            for(int i=1; i<=n; i++){
                if(i % 2 == 1) System.out.println(i+" ");
            }
        }else if(input == "e"){
            for(int i=1; i<=n; i++){
                if(i % 2 == 0) System.out.println(i+" ");
            }
        }
    }
}
