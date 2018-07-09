package com.lcm.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2018/7/8 17:39
 * Desc:
 * *****************************************************************
 */
public class Folder extends AbstractFile{
    private List<AbstractFile> abstractFileList;
    private String name;

    public Folder(String name) {
        this.name = name;
        abstractFileList = new ArrayList<>();
    }

    @Override
    public void add(AbstractFile abstractFile) {
        abstractFileList.add(abstractFile);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        abstractFileList.remove(abstractFile);
    }

    @Override
    public AbstractFile getFile(int i) {
        return abstractFileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("++++++对文件夹 "+name+ " 进行杀毒++++++");

        for (AbstractFile abstractFile : abstractFileList) {
            abstractFile.killVirus();
        }
    }
}
