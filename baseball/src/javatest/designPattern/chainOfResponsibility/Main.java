package javatest.designPattern.chainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.process(10);
        chain.process(0);
        chain.process(-10);
    }
}
