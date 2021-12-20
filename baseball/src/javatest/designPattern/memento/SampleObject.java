package javatest.designPattern.memento;

public class SampleObject {

    private String state;

    public SampleObject(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveState(){
        return new Memento(state);
    }
}
