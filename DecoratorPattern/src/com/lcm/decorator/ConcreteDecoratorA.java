package com.lcm.decorator;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/17 下午4:18
 * Desc:
 * *****************************************************************
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        methodA();
    }

    public void methodA(){
        System.out.println("ConcreteDecoratorA methodA");
    }
}
