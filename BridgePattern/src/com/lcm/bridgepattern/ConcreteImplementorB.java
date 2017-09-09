package com.lcm.bridgepattern;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/9 下午5:48
 * Desc:
 * *****************************************************************
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("this is ConcreteImplementorB operation!");
    }
}
