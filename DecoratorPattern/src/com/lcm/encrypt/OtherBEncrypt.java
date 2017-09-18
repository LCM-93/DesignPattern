package com.lcm.encrypt;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/17 上午10:38
 * Desc:
 * *****************************************************************
 */
public class OtherBEncrypt extends EncryptDecorator {

    public OtherBEncrypt(EncryptComponent encryptComponent) {
        super(encryptComponent);
    }

    @Override
    String encrypt(String str) {
        return otherBEncrypt(super.encrypt(str));
    }

    public String otherBEncrypt(String str){
        System.out.println("对字符串 \'"+str+"\' 使用OtherB加密   =====>  OtherB加密结果");
        return "OtherB 加密后结果";
    }
}
