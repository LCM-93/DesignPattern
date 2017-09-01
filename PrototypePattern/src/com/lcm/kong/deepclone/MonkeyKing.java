package com.lcm.kong.deepclone;

import java.io.*;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/1 下午1:40
 * Desc:
 * *****************************************************************
 */
public class MonkeyKing implements Serializable {

    private int height;

    private int weight;

    private int age;

    private GoldHoopStick goldHoopStick;

    public MonkeyKing(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        goldHoopStick = new GoldHoopStick();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GoldHoopStick getGoldHoopStick() {
        return goldHoopStick;
    }


    public MonkeyKing deepClone() {
        Object object = null;
        try {
            //将对象写入流中
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            //将对象从流中取出
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            object = ois.readObject();
            return (MonkeyKing) object;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
