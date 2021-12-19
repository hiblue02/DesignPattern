package javatest.designPattern.proxy;

public class Circle implements Shape{

    public Circle() {
        System.out.println("Before Draw");
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
