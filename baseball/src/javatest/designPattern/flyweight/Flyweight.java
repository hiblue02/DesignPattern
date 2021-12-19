package javatest.designPattern.flyweight;

import java.util.HashMap;

public class Flyweight {

    private static final HashMap<String, 네모> 네모들 = new HashMap<>();

    public static 네모 get네모(String color){
        if(네모들.containsKey(color)){
            return 네모들.get(color);
        }

        네모 네모 = new 네모(color);
        네모들.put(color, 네모);
        return 네모;
    }

}
