package com.lcm.music;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 上午11:45
 * Desc:
 * *****************************************************************
 */
public abstract class PlayerBuilder {

    protected MusicPlayer player = new MusicPlayer();

    public abstract void buildType();
    public abstract void buildMenu();
    public abstract void buildPlayerList();
    public abstract void buildMainWindows();
    public abstract void buildControlStrip();
    public abstract void buildCollectionList();

    public MusicPlayer createPlayer(){
        return player;
    }

}
