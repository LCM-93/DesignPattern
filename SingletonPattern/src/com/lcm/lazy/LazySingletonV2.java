package com.lcm.lazy;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/30 下午1:57
 * Desc:
 * *****************************************************************
 */
public class LazySingletonV2 {

    private static LazySingletonV2 instance ;

    private LazySingletonV2(){
    }

    public static synchronized LazySingletonV2 getInstance(){
        if(instance == null){
            instance = new LazySingletonV2();
        }
        return instance;
    }
}
