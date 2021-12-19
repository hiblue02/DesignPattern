package javatest.designPattern.chainOfResponsibility;

public class NegativeProcessor extends Processor {

    public NegativeProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(Integer request) {
        if(request < 0){
            System.out.println("request is negative.");
            return;
        }
        super.process(request);

    }
}
