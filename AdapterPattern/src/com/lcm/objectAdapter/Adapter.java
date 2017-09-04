package com.lcm.objectAdapter;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/4 下午1:55
 * Desc:
 * *****************************************************************
 */
public class Adapter implements Target {

    private  Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
