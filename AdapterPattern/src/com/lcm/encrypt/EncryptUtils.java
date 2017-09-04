package com.lcm.encrypt;

import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/4 下午2:02
 * Desc:
 * *****************************************************************
 */
public class EncryptUtils {

    public String MD5Encrypt(String str) {
        String encode = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            BASE64Encoder base64Encoder = new BASE64Encoder();
            encode = base64Encoder.encode(md5.digest(str.getBytes()));
            return encode;
        } catch (NoSuchAlgorithmException e) {
            System.out.println("加密出错");
            return null;
        }
    }

    public String DESEncrypt(String str) {
        String password = "01234567";
        String encode = null;
        try {
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            //创建一个密匙工厂，然后用它把DESKeySpec转换成
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            //Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance("DES");
            //用密匙初始化Cipher对象
            cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
            //现在，获取数据并加密
            //正式执行加密操作
            byte[] bytes = cipher.doFinal(str.getBytes());
            BASE64Encoder base64Encoder = new BASE64Encoder();
            encode = base64Encoder.encode(bytes);
            return encode;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }

    public String RSAEncrypt(String str) {
        return "实现RSA加密返回 ->_->";
    }
}
