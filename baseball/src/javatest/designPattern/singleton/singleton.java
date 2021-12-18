package javatest.designPattern.singleton;

public class singleton {

    private static singleton instance ;

    public singleton() {
    }

    public static singleton getInstance() {
        if (instance == null){
            instance = new singleton();
        }
        return instance;
    }
}
