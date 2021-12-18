package javatest.designPattern.abstractfactory;

public class 아이폰Factory extends 스마트폰Factory{

    @Override
    스마트폰 getSmartPhone(String name) {
        
        if("iPhone 13".equals(name)){
            return new iPhone13();
        }
        
        throw new IllegalArgumentException("아이폰이 아닙니다.");
    }
}
