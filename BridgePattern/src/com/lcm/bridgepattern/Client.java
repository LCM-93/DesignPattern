package com.lcm.bridgepattern;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/9 下午5:50
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args) {
        Abstraction abstraction;
        Implementor implementor;

        abstraction = new DefindAbstraction();
        implementor = new ConcreteImplementorA();
        abstraction.setImpl(implementor);
        abstraction.operation();

        implementor = new ConcreteImplementorB();
        abstraction.setImpl(implementor);
        abstraction.operation();
    }
}
