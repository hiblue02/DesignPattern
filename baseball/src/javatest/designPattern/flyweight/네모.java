package javatest.designPattern.flyweight;

public class 네모 implements 도형 {

    private String color;

    public 네모(String color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return color+" 네모";
    }
}
