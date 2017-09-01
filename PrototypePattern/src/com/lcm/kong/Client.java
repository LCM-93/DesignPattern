package com.lcm.kong;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/1 下午2:31
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args) {
        MonkeyKing monkeyKing = new MonkeyKing(180, 75, 500);

        MonkeyKing copyMonkey = (MonkeyKing) monkeyKing.clone();

        System.out.println(monkeyKing == copyMonkey);
    }
}
