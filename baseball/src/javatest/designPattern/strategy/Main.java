package javatest.designPattern.strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        int a = 10;
        int b = 2;

        context.setStrategy(new AddStrategy());
        System.out.println("context add = " + context.execute(a, b)); context.setStrategy(new AddStrategy());

        context.setStrategy(new SubtractStrategy());
        System.out.println("context subtract = " + context.execute(a, b)); context.setStrategy(new AddStrategy());

        context.setStrategy(new MultiplyStrategy());
        System.out.println("context multiply = " + context.execute(a, b));
    }
}
