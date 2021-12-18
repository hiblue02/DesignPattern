package javatest.designPattern.prototype;

public class Main {

    public static void main(String[] args) {

        prototype prototype = new prototype();

        Shape orgin1 = new Triangle();
        Shape orgin2 = new Circle();
        Shape orgin3 = new Triangle();

        prototype.setShape(1, orgin1);
        prototype.setShape(2, orgin2);
        prototype.setShape(3, orgin3);

        Shape clone1 = prototype.getShape(1);
        System.out.println( "orgin1 : hashCode="+orgin1.toString()
                + ", name="+ orgin1.getName()
                + ", name hashCode="+orgin1.getName().hashCode());
        System.out.println( "clone1 : hashCode="+clone1.toString()
                + ", name="+ clone1.getName()
                + ", name hashCode="+clone1.getName().hashCode());

        Shape clone2 = prototype.getShape(2);
        System.out.println( "orgin2 : hashCode=" +orgin2.toString()
                + ", name="+ orgin2.getName()
                + ", name hashCode="+orgin2.getName().hashCode());
        System.out.println("clone2 : hashCode=" +clone2.toString()
                + ", name="+ clone2.getName()
                + ", name hashCode="+clone2.getName().hashCode());

        Shape clone3 = prototype.getShape(3);
        System.out.println( "orgin3 : hashCode=" +orgin3.toString()
                + ", name="+ orgin3.getName()
                + ", name hashCode="+orgin3.getName().hashCode());

        System.out.println("clone3 : hashCode=" +clone3.toString()
                + ", name="+ clone3.getName()
                + ", name hashCode="+clone3.getName().hashCode());
    }

}
