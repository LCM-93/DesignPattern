package com.lcm.encrypt;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/4 下午2:17
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args) {
        EncryptModel encryptModel;

        encryptModel = new EncryptAdapter();

        String encode = encryptModel.userEncrypt("userName");

        System.out.println("加密后的数据为：" + encode);
    }
}
