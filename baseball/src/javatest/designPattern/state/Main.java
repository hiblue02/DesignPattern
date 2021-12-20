package javatest.designPattern.state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        State play = new Play();
        play.execute(context);
        System.out.println("context state = " + context.getState().getClass().getName());

        State pause = new Pause();
        pause.execute(context);
        System.out.println("context state = " + context.getState().getClass().getName());
    }
}
