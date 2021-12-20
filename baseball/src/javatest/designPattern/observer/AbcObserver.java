package javatest.designPattern.observer;

public class AbcObserver extends Observer{

    public AbcObserver(SampleObject object) {
        this.object = object;
        this.object.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Abc Observer is notified : "+this.object.getState());
    }
}
