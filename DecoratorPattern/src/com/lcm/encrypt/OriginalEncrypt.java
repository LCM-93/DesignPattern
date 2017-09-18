package com.lcm.encrypt;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/17 上午10:26
 * Desc:
 * *****************************************************************
 */
public class OriginalEncrypt extends EncryptComponent {

    @Override
    String encrypt(String str) {
        System.out.println("对字符串 \'"+str+"\' 使用原始加密   =====>  原始加密结果");
        String encryptStr = "原始加密结果";
        return encryptStr;
    }
}
