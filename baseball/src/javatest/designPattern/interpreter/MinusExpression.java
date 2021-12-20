package javatest.designPattern.interpreter;

public class MinusExpression implements Expression {
    String data = "-";

    @Override
    public boolean interprete(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
