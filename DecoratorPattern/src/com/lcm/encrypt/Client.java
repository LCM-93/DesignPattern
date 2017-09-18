package com.lcm.encrypt;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/17 上午10:39
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args) {
        EncryptComponent originalEncrypt, otherAEncrypt, otherBEncrypt;
        String result;

        originalEncrypt = new OriginalEncrypt();
        result = originalEncrypt.encrypt("初始数据");
        System.out.println("-----------------------------------------------");

        otherAEncrypt = new OtherAEncrypt(originalEncrypt);
        result = otherAEncrypt.encrypt("初始数据");
        System.out.println("-----------------------------------------------");

        otherBEncrypt = new OtherBEncrypt(originalEncrypt);
        result = otherBEncrypt.encrypt("初始数据");
        System.out.println("-----------------------------------------------");

        otherBEncrypt = new OtherBEncrypt(otherAEncrypt);
        result = otherBEncrypt.encrypt("初始数据");
        System.out.println("-----------------------------------------------");

    }
}
