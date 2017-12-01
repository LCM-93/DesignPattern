package com.lcm;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/12/1 下午3:39
 * Desc:
 * *****************************************************************
 */
public class ProxySubject extends Subject {

    private RealSubject realSubject = new RealSubject();


    public void preRequest(){
        System.out.println("代理类：请求前操作");
    }

    @Override
    void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void postRequest(){
        System.out.println("代理类：请求后操作");
    }
}
