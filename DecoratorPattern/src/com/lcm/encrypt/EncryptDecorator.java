package com.lcm.encrypt;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/17 上午10:31
 * Desc:
 * *****************************************************************
 */
public class EncryptDecorator extends EncryptComponent {

    EncryptComponent encryptComponent;

    public EncryptDecorator(EncryptComponent encryptComponent) {
        this.encryptComponent = encryptComponent;
    }

    @Override
    String encrypt(String str) {
        return encryptComponent.encrypt(str);
    }
}
