package com.lcm.hungry;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/30 下午1:52
 * Desc:
 * *****************************************************************
 */
public class HungrySingletonV2 {

    private static HungrySingletonV2 instance;

    static {
        instance = new HungrySingletonV2();
    }

    private HungrySingletonV2(){
    }

    public static HungrySingletonV2 getInstance(){
        return instance;
    }
}
