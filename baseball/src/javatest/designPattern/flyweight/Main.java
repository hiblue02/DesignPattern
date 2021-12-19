package javatest.designPattern.flyweight;

public class Main {

    public static void main(String[] args) {

        네모 빨강네모1 = Flyweight.get네모("빨강");
        System.out.println("빨강네모1 : "+빨강네모1.toString());
        네모 빨강네모2 = Flyweight.get네모("빨강");
        System.out.println("빨강네모2 : "+빨강네모2.toString());
        네모 파랑네모 = Flyweight.get네모("파랑");
        System.out.println("파랑네모 : "+파랑네모.toString());

    }

}
