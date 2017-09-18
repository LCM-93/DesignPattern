package com.lcm.encrypt;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/17 上午10:34
 * Desc:
 * *****************************************************************
 */
public class OtherAEncrypt extends EncryptDecorator {

    public OtherAEncrypt(EncryptComponent encryptComponent) {
        super(encryptComponent);
    }

    @Override
    String encrypt(String str) {
        return otherAEncrypt(super.encrypt(str));
    }

    public String otherAEncrypt(String str){
        System.out.println("对字符串 \'"+str+"\' 使用OtherA加密   =====>  OtherA加密结果");
        return "OtherA 加密结果";
    }
}
