package javatest.designPattern.mediator;

public class ConcreteMediator implements Mediator {
    @Override
    public void play(Command command, String string) {
        System.out.println(command.getClass().getName()+":"+string);
    }
}
