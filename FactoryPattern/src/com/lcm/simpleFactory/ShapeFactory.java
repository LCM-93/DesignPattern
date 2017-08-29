package com.lcm.simpleFactory;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午2:27
 * Desc:
 * *****************************************************************
 */
public class ShapeFactory {

    public static Shape getShape(String type) {
        Shape shape = null;

        if (type.equalsIgnoreCase("ROUND")) {
            shape = new RoundShape();
        } else if (type.equalsIgnoreCase("TRIANGLE")) {
            shape = new TriangleShape();
        }
        return shape;
    }
}
