package com.lcm.classAdapter;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/4 下午1:56
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args) {
        Target target;

        target = new Adapter();

        target.request();
    }
}
