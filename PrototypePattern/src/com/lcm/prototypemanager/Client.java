package com.lcm.prototypemanager;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/1 下午1:48
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args) {

        Prototype prototype1 = PrototypeManager.instance.get("CPA");
        Prototype prototype2 = PrototypeManager.instance.get("CPA");

        System.out.println("两个对象是同一个对象？ " + (prototype1 == prototype2));
        System.out.println("两个对象值相等？ " + prototype1.equals(prototype2));
    }
}
