package javatest.designPattern.builder;

public class BuilderMain {

    public void main(){
        ObjectBuilder builder = new ObjectBuilder();
        Object object = builder.setA("a").setC("C").setB("B").setD("D").build();
    }
}
