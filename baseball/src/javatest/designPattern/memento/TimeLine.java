package javatest.designPattern.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TimeLine {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

    public String printHistory(){
       return mementoList.stream().map(Memento::toString).collect(Collectors.joining("\n"));
    }

}
