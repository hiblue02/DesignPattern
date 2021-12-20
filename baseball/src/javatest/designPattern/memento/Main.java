package javatest.designPattern.memento;

public class Main {
    public static void main(String[] args) {
        TimeLine timeLine = new TimeLine() ;
        SampleObject sampleObject = new SampleObject("start");

        timeLine.add(sampleObject.saveState());

        sampleObject.setState("doing 1 step");
        timeLine.add(sampleObject.saveState());

        System.out.println("====== show history ======");
        System.out.println(timeLine.printHistory());
    }
}
