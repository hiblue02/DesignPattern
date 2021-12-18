package javatest.designPattern.adapter;

public class Adapter implements Ctype{

    private Micro5pin micro5pin;

    public Adapter( Micro5pin micro5pin ) {
        this.micro5pin = micro5pin;
    }


    @Override
    public String charging() {
        return micro5pin.charging();
    }
}
