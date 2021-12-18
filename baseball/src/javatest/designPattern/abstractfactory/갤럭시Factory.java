package javatest.designPattern.abstractfactory;

public class 갤럭시Factory extends 스마트폰Factory{
    @Override
    스마트폰 getSmartPhone(String name) {
        if("Galaxy S22".equals(name)){
            return new GalaxyS22();
        }
        if("Galaxy Ultra S22".equals(name)){
            return new GalaxyUltraS22();
        }
        throw new IllegalArgumentException("갤럭시가 아닙니다.");
    }
}
