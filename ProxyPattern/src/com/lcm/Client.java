package com.lcm;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/12/1 下午3:42
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[]  args){
        Subject subject = new ProxySubject();

        subject.request();
    }
}
