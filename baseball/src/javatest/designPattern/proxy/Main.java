package javatest.designPattern.proxy;

public class Main {
    public static void main(String[] args) {
        ShapeProxy shapeProxy = new ShapeProxy();
        shapeProxy.draw();
        shapeProxy.draw();
    }
}
