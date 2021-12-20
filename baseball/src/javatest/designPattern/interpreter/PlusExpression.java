package javatest.designPattern.interpreter;

public class PlusExpression implements Expression {
    String plus = "+";

    @Override
    public boolean interprete(String context) {
        if(context.contains(plus)){
            return true;
        }
        return false;
    }
}
