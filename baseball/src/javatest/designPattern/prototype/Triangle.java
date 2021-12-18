package javatest.designPattern.prototype;

public class Triangle extends Shape{

    public Triangle() {
        super("Triangle");
    }

    public Triangle(Triangle shape) {
        super(shape);
    }
}
