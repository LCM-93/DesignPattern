package com.lcm.composite;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2018/7/8 17:36
 * Desc:
 * *****************************************************************
 */
public class File extends AbstractFile {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile abstractFile) {
        System.out.println("不支持该操作");
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        System.out.println("不支持该操作");
    }

    @Override
    public AbstractFile getFile(int i) {
        System.out.println("不支持该操作");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("======文件 《"+name+ "》 执行杀毒操作======");
    }
}
