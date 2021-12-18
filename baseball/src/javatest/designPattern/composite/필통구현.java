package javatest.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class 필통구현 implements 필통{

    private List<연필> 연필들;
    private List<지우개> 지우개들;

    public 필통구현() {
        this.연필들 = new ArrayList<>();
        this.지우개들 = new ArrayList<>();
    }

    @Override
    public void 연필넣기(연필 연필) {
        연필들.add(연필);
    }

    @Override
    public void 지우개넣기(지우개 지우개) {
        지우개들.add(지우개);
    }

    @Override
    public String toString() {
        return "필통구현{" +
                "연필들=" + 연필들.size() +
                ", 지우개들=" + 지우개들.size() +
                '}';
    }
}
