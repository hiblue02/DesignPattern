package javatest.designPattern.command;

public class CommandReceiver {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(){
        command.execute();
    }
}
