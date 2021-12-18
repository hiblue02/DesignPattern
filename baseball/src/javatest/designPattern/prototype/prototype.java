package javatest.designPattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class prototype {

    private static Map<Integer, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(Integer id) {
        return (Shape) shapeMap.get(id).clone();
    }

    public static void setShape(Integer id, Shape shape) {
        shapeMap.put(id, shape);
    }

}