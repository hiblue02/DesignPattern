package javatest.designPattern.state;

public class Pause implements State{
    @Override
    public void execute(Context context) {
        System.out.println("State set pause");
        context.setState(this);
    }
}
