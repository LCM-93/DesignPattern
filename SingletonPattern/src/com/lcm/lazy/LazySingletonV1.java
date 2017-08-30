package com.lcm.lazy;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/30 下午1:57
 * Desc:
 * *****************************************************************
 */
public class LazySingletonV1 {

    private static LazySingletonV1 instance ;

    private LazySingletonV1(){
    }

    public static LazySingletonV1 getInstance(){
        if(instance == null){
            instance = new LazySingletonV1();
        }
        return instance;
    }
}
