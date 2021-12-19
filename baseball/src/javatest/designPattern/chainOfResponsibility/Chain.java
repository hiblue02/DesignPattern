package javatest.designPattern.chainOfResponsibility;

public class Chain {

    Processor chain;

    public Chain() {
        build();
    }

    private void build() {
        chain = new PositiveProcessor(new ZeroProcessor(new NegativeProcessor(null)));
    }

    public void process(Integer request){
        chain.process(request);
    }

}
