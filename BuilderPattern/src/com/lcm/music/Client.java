package com.lcm.music;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 下午12:01
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args) {
        MusicPlayer player;
        PlayerBuilder builder;
        PlayerController controller;

        builder = new MemoryPlayerBuilder();
        controller = new PlayerController();

        player = controller.construct(builder);

        System.out.println(player.toString());
    }
}
