package com.lcm.bridgepattern;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/9 下午5:47
 * Desc:
 * *****************************************************************
 */
public abstract class Abstraction {

    protected Implementor impl;

    public void setImpl(Implementor impl){
        this.impl = impl;
    }

    public abstract void operation();
}
