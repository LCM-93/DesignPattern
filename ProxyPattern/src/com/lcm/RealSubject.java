package com.lcm;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/12/1 下午3:38
 * Desc:
 * *****************************************************************
 */
public class RealSubject extends Subject {
    @Override
    void request() {
        System.out.println("真实请求方法");
    }
}
