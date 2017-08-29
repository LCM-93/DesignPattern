package com.lcm.factoryMethod;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午2:46
 * Desc:
 * *****************************************************************
 */
public class JpgReader implements Reader {

    @Override
    public void readPic() {
        System.out.println("读取JPG格式图片！");
    }
}
