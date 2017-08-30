package com.lcm.lazy;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/30 下午2:04
 * Desc:
 * *****************************************************************
 */
public class LazySingletonV3 {
    private volatile static LazySingletonV3 instance;

    private LazySingletonV3() {

    }

    public static LazySingletonV3 getInstance() {
        if (instance == null) {
            synchronized (LazySingletonV3.class) {
                instance = new LazySingletonV3();
            }
        }
        return instance;
    }
}
