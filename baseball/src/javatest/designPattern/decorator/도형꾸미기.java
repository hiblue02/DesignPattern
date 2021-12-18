package javatest.designPattern.decorator;

public class 도형꾸미기 extends 도형그리기{

    public 도형꾸미기(도형 도형) {
        super(도형);
    }

    @Override
    public void 그리기() {
        super.그리기();
        색칠하기();
    }

    private void 색칠하기() {
        System.out.println("색칠하기");
    }
}
