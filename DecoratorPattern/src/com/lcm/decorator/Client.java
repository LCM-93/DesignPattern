package com.lcm.decorator;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/17 下午4:20
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args) {
        Component concreteComponent, concreteDecoratorA, concreteDecoratorB;

        concreteComponent = new ConcreteComponent();
        concreteComponent.operation();
        System.out.println("----------------------------");

        concreteDecoratorA = new ConcreteDecoratorA(concreteComponent);
        concreteDecoratorA.operation();
        System.out.println("----------------------------");

        concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);
        concreteDecoratorB.operation();
        System.out.println("----------------------------");
    }
}
