package kr.hs.study.beans;

import lombok.Data;

@Data
public class TestBean1 {

    private DataBean1 data1;
    private DataBean2 data2;

    public DataBean1 getData1(){
        return data1;
    }

    public DataBean2 getData2(){
        return data2;
    }


}
