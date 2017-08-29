package com.lcm.simpleFactory.client;

import com.lcm.simpleFactory.Shape;
import com.lcm.simpleFactory.ShapeFactory;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 上午9:49
 * Desc: 简单工厂模式
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args) {
        Shape shape;

        shape = ShapeFactory.getShape("round");
        shape.draw();
        shape.erase();

        shape = ShapeFactory.getShape("triangle");
        shape.draw();
        shape.erase();
    }
}
