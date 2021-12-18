package javatest.designPattern.decorator;

public class 도형그리기 implements 도형 {

    protected 도형 도형;

    public 도형그리기(도형 도형) {
        this.도형 = 도형;
    }

    @Override
    public void 그리기() {
        도형.그리기();
    }
}
