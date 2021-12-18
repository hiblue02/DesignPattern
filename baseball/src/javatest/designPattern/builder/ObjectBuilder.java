package javatest.designPattern.builder;

public class ObjectBuilder {

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;


    public ObjectBuilder setA(String a){
        this.a = a;
        return this;
    }
    public ObjectBuilder setB(String b){
        this.b = b;
        return this;
    }
    public ObjectBuilder setC(String c){
        this.c = c;
        return this;
    }
    public ObjectBuilder setD(String d){
        this.d = d;
        return this;
    }

    public Object build(){
        return new Object(a,b,c,d,e,f,g,h);
    }
}
