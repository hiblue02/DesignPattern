package javatest.designPattern.composite;

public class Client {

    public static void main(String[] args) {
        필통 필통 = new 필통구현() ;

        필통.연필넣기(new 연필());
        필통.지우개넣기(new 지우개());

        System.out.println("필통 = " + 필통);

    }
}
