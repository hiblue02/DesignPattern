package javatest.designPattern.facade;

public class 도형그리기 {

    세모 세모그리기(){
        return new 세모();
    };

    네모 네모그리기(){
        return new 네모();
    }

    동그라미 동그라미그리기(){
        return new 동그라미();
    }

}
