package com.lcm.bridgepattern;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/9 下午5:50
 * Desc:
 * *****************************************************************
 */
public class DefindAbstraction extends Abstraction {
    @Override
    public void operation() {
        impl.operationImpl();
    }
}
