package javatest.designPattern.prototype;

abstract class Shape implements Cloneable {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public Shape(Shape shape) {
        super();
        this.name = shape.name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}