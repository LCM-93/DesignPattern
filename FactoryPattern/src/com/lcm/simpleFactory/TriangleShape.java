package com.lcm.simpleFactory;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午2:26
 * Desc:
 * *****************************************************************
 */
public class TriangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("画了一个三角形！");
    }

    @Override
    public void erase() {
        System.out.println("擦除一个三角形！");
    }
}
