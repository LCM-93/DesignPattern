package com.lcm.lazy;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/30 下午2:04
 * Desc:
 * *****************************************************************
 */
public class LazySingletonV4 {
    private  volatile static LazySingletonV4 instance;

    private LazySingletonV4(){

    }

    public static LazySingletonV4 getInstance(){
        //检查实例是否存在，不存在才进入同步块
        if(instance == null){
            //同步块，保证线程安全
            synchronized(LazySingletonV4.class){
                //再次检查实例是否存在，不存在才创建实例
                if(instance == null){
                    instance = new LazySingletonV4();
                }
            }
        }
        return instance;
    }
}
