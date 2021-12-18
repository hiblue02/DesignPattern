package javatest.designPattern.decorator;

public class Main {
    public static void main(String[] args) {
        도형꾸미기 도형 = new 도형꾸미기(new 세모());
        도형.그리기();
    }

}
