package javatest.designPattern.command;

public class SaveCommand implements Command {
    private Document dosc;

    public SaveCommand(Document dosc) {
        this.dosc = dosc;
    }

    @Override
    public void execute() {
        dosc.save();;
    }
}
