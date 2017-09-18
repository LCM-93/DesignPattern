package com.lcm.decorator;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/17 下午4:19
 * Desc:
 * *****************************************************************
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        methodB();
    }

    public void methodB() {
        System.out.println("ConcreteDecoratorB methodB");
    }
}
