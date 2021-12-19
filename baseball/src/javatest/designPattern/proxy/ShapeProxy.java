package javatest.designPattern.proxy;

public class ShapeProxy implements Shape{

    private Shape shape;

    @Override
    public void draw() {
        if(null == shape){
            shape = new Circle();
        }
        shape.draw();
    }
}
