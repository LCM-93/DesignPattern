package com.lcm.hungry;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/30 下午1:49
 * Desc: 饿汉式单例
 * *****************************************************************
 */
public class HungrySingletonV1 {

    private static HungrySingletonV1 instance = new HungrySingletonV1();

    private HungrySingletonV1(){

    }

    public static HungrySingletonV1 getInstance(){
        return instance;
    }
}
