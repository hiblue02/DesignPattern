package javatest.designPattern.chainOfResponsibility;

public class ZeroProcessor extends Processor {

    public ZeroProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(Integer request) {
        if(request == 0){
            System.out.println("request is zero.");
            return;
        }
        super.process(request);

    }
}
