package com.lcm.music;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 上午11:49
 * Desc:
 * *****************************************************************
 */
public class FullPlayerBuilder extends PlayerBuilder {
    @Override
    public void buildType() {
        player.setType("完整模式");
    }

    @Override
    public void buildMenu() {
        player.setMenu("菜单");
    }

    @Override
    public void buildPlayerList() {
        player.setPlayerList("播放列表");
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
