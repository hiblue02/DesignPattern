package javatest.designPattern.observer;

public class Main {
    public static void main(String[] args) {
        SampleObject object = new SampleObject();
        new AbcObserver(object);
        new DefObserver(object);
        object.setState("doing start");
    }
}
