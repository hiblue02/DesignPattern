package javatest.designPattern.prototype;

public class Circle extends Shape {

    public Circle() {
        super("Circle");
    }

    public Circle(Circle shape) {
        super(shape);
    }
}