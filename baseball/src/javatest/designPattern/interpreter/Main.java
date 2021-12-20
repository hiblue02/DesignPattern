package javatest.designPattern.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression plus = new PlusExpression();
        Expression minus = new MinusExpression();

        System.out.println("plus.interprete(\"1+3\") = " + plus.interprete("1+3"));
        System.out.println("minus.interprete(\"1+3\") = " + minus.interprete("1+3"));
    }
}
