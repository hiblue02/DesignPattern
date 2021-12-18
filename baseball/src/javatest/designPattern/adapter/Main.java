package javatest.designPattern.adapter;

public class Main {

    public static void main(String[] args) {

        Micro5pin cable = new Micro5pinCableB();
        System.out.println(cable.charging());

        Ctype adopter = new Adapter(cable);
        System.out.println(adopter.charging());

    }
}
