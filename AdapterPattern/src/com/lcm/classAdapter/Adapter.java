package com.lcm.classAdapter;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/4 下午1:55
 * Desc:
 * *****************************************************************
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        specificRequest();
    }

    @Override
    public void specificRequest() {
        super.specificRequest();
    }
}
