package com.lcm.encrypt;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/4 下午2:16
 * Desc:
 * *****************************************************************
 */
public class EncryptAdapter extends EncryptModel {

    private final EncryptUtils encryptUtils;

    public EncryptAdapter() {
        encryptUtils = new EncryptUtils();
    }

    @Override
    String userEncrypt(String str) {
        return encryptUtils.MD5Encrypt(str);
    }
}
