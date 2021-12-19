package javatest.designPattern.command;

public class OpenCommand implements Command {
    private Document document;

    public OpenCommand(Document doc) {
        this.document = doc;
    }

    @Override
    public void execute() {
        document.open();;
    }
}
