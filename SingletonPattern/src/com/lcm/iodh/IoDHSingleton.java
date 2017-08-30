package com.lcm.iodh;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/30 下午2:15
 * Desc:
 * *****************************************************************
 */
public class IoDHSingleton {

    private IoDHSingleton() {

    }

    private static class SingletonHolder {
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
