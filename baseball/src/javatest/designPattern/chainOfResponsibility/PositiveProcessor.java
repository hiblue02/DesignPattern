package javatest.designPattern.chainOfResponsibility;

public class PositiveProcessor extends Processor {

    public PositiveProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(Integer request) {
        if(request > 0){
            System.out.println("request is positive.");
            return;
        }
        super.process(request);

    }
}
