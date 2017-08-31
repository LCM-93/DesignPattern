package com.lcm.music;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 上午11:53
 * Desc:
 * *****************************************************************
 */
public class SimplePlayerBuilder extends PlayerBuilder {
    @Override
    public void buildType() {
        player.setType("精简模式");
    }

    @Override
    public void buildMenu() {
        player.setMenu(null);
    }

    @Override
    public void buildPlayerList() {
        player.setPlayerList(null);
    }

    @Override
    public void buildMainWindows() {
        player.setMainWindows("主界面");
    }

    @Override
    public void buildControlStrip() {
        player.setControlStrip("控制条");
    }

    @Override
    public void buildCollectionList() {
        player.setCollectionList(null);
    }
}
