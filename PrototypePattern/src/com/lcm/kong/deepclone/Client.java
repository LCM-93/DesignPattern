package com.lcm.kong.deepclone;

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

        MonkeyKing copyMonkey = monkeyKing.deepClone();

        System.out.println("是同一个大圣？ " + (monkeyKing == copyMonkey));
        System.out.println("是同一根棒子吗？ " + (monkeyKing.getGoldHoopStick() == copyMonkey.getGoldHoopStick()));
    }
}
