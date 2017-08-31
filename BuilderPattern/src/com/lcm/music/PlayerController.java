package com.lcm.music;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 下午12:02
 * Desc:
 * *****************************************************************
 */
public class PlayerController {

    public MusicPlayer construct(PlayerBuilder pb) {
        pb.buildType();
        pb.buildMenu();
        pb.buildPlayerList();
        pb.buildMainWindows();
        pb.buildControlStrip();
        pb.buildCollectionList();
        return pb.createPlayer();
    }

}
