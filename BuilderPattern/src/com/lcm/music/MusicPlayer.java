package com.lcm.music;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 上午11:44
 * Desc:
 * *****************************************************************
 */
public class MusicPlayer {
    private String type;
    private String menu;
    private String playerList;
    private String mainWindows;
    private String controlStrip;
    private String collectionList;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("这是一个 ").append(type).append(" 音乐播放器\n\n");
        sb.append("播放器拥有：\n");
        if (menu != null) sb.append(menu).append("\n");
        if (playerList != null) sb.append(playerList).append("\n");
        if (mainWindows != null) sb.append(mainWindows).append("\n");
        if (controlStrip != null) sb.append(controlStrip).append("\n");
        if (collectionList != null) sb.append(collectionList).append("\n");
        return sb.toString();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlayerList() {
        return playerList;
    }

    public void setPlayerList(String playerList) {
        this.playerList = playerList;
    }

    public String getMainWindows() {
        return mainWindows;
    }

    public void setMainWindows(String mainWindows) {
        this.mainWindows = mainWindows;
    }

    public String getControlStrip() {
        return controlStrip;
    }

    public void setControlStrip(String controlStrip) {
        this.controlStrip = controlStrip;
    }

    public String getCollectionList() {
        return collectionList;
    }

    public void setCollectionList(String collectionList) {
        this.collectionList = collectionList;
    }
}
