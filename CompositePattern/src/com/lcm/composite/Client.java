package com.lcm.composite;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2018/7/8 17:42
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args){
        AbstractFile file1 = new File("文件1.txt");
        AbstractFile file2 = new File("文件2.jpg");
        AbstractFile file3 = new File("文件3.rmvb");
        AbstractFile file4 = new File("文件4.png");
        AbstractFile file5 = new File("文件5.md");
        AbstractFile file6 = new File("文件6.txt");
        AbstractFile file7 = new File("文件7.html");

        AbstractFile folderA = new Folder("文件夹A");
        AbstractFile folderB = new Folder("文件夹B");
        AbstractFile folderC = new Folder("文件夹C");
        AbstractFile folderRoot = new Folder("根文件夹");

        folderA.add(file1);
        folderA.add(file2);

        folderC.add(file3);
        folderC.add(file4);

        folderB.add(file5);
        folderB.add(file6);
        folderB.add(folderC);

        folderRoot.add(file7);
        folderRoot.add(folderA);
        folderRoot.add(folderB);

        folderRoot.killVirus();
    }
}
