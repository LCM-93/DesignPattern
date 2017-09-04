package com.lcm.defaultAdapter;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/4 下午7:12
 * Desc:
 * *****************************************************************
 */
public class ConcreteService extends ServiceAdapter {

    @Override
    public void serviceOperation1() {
        System.out.println("serviceOperation1");
    }
}
