package com.lcm.music;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 上午11:54
 * Desc:
 * *****************************************************************
 */
public class MemoryPlayerBuilder extends PlayerBuilder {

    @Override
    public void buildType() {
        player.setType("记忆模式");
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
        player.setCollectionList("收藏列表");
    }
}
