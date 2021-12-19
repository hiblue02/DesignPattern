package javatest.designPattern.chainOfResponsibility;

import java.util.Objects;

public abstract class Processor {
    private Processor processor;

    public Processor(Processor processor) {
        this.processor = processor;
    }

    public void process(Integer request){
        if( ! Objects.isNull(processor)){
            processor.process(request);
        }
    }

}
