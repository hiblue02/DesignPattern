package javatest.designPattern.state;

public class Play implements State {

    @Override
    public void execute(Context context) {
        System.out.println("State set play");
        context.setState(this);
    }
}
