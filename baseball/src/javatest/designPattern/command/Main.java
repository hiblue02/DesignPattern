package javatest.designPattern.command;

public class Main {
    public static void main(String[] args) {
        CommandReceiver receiver = new CommandReceiver();
        Document document = new Document();
        receiver.setCommand(new OpenCommand(document));
        receiver.execute();
        receiver.setCommand(new PrintCommand(document));
        receiver.execute();
    }
}
