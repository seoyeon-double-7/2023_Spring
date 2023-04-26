package kr.hs.study.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Taxi implements Meter{
    public int BASE_FARE = 3000;

    public Taxi() {
    }

    public Taxi(int BASE_FARE) {
        this.BASE_FARE = BASE_FARE;
    }

    public void start(){
        System.out.println("운행을 시작합니다.");
    }
    public int stop(int distance){
        int fare = BASE_FARE + distance * 2;
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원 입니다.");
        return fare;
    }
}
