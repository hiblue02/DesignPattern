package javatest.designPattern.observer;

public class DefObserver extends Observer{
    public DefObserver(SampleObject object) {
        this.object = object;
        this.object.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Def Observer is notified : "+this.object.getState());
    }
}
