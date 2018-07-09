package com.lcm.composite;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2018/7/8 17:34
 * Desc:
 * *****************************************************************
 */
public abstract class AbstractFile {

    public abstract void add(AbstractFile abstractFile);

    public abstract void remove(AbstractFile abstractFile);

    public abstract  AbstractFile getFile(int i);

    public abstract void killVirus();

}
