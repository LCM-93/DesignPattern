package com.lcm.factoryMethod;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午2:48
 * Desc:
 * *****************************************************************
 */
public class JpgReaderFactory implements ReaderFactory {
    @Override
    public Reader createReader() {
        return new JpgReader();
    }
}
