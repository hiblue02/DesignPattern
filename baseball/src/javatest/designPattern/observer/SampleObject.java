package javatest.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class SampleObject {
    private List<Observer> observers = new ArrayList<>();
    public String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        observers.stream().forEach(Observer::update);
    }
}
