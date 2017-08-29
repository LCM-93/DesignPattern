package com.lcm.simpleFactory;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午2:24
 * Desc:
 * *****************************************************************
 */
public class RoundShape implements Shape {

    @Override
    public void draw() {
        System.out.println("画了一个圆形！");
    }

    @Override
    public void erase() {
        System.out.println("擦除一个圆形！");
    }
}
