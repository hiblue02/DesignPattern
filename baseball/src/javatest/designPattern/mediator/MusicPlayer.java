package javatest.designPattern.mediator;

public class MusicPlayer implements Command {
    Mediator meidator;

    public MusicPlayer(Mediator meidator) {
        this.meidator = meidator;
    }

    public MusicPlayer() {
        this.meidator = new ConcreteMediator();
    }

    @Override
    public void execute() {
        meidator.play(this, "♬♩");
    }
}
