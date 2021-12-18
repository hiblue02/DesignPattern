package javatest.designPattern.facade;

public class Main {
    public static void main(String[] args) {
        도형그리기 도형그리기 = new 도형그리기();
        
        세모 세모 = 도형그리기.세모그리기();
        네모 네모 = 도형그리기.네모그리기();
        동그라미 동그라미 = 도형그리기.동그라미그리기();

    }
}
