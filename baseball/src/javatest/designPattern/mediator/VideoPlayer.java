package javatest.designPattern.mediator;

public class VideoPlayer implements Command{
    Mediator meidator;

    public VideoPlayer(Mediator meidator) {
        this.meidator = meidator;
    }

    public VideoPlayer() {
        this.meidator = new ConcreteMediator();
    }

    @Override
    public void execute() {
        meidator.play(this, "(●'◡'●)(●'◡'●)");
    }
}
