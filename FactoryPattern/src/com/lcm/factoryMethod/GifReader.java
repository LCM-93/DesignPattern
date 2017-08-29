package com.lcm.factoryMethod;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午2:45
 * Desc:
 * *****************************************************************
 */
public class GifReader implements Reader {
    @Override
    public void readPic() {
        System.out.println("读取gif格式图片");
    }
}
