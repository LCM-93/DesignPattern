package com.lcm.factoryMethod.client;

import com.lcm.factoryMethod.GifReaderFactory;
import com.lcm.factoryMethod.JpgReaderFactory;
import com.lcm.factoryMethod.Reader;
import com.lcm.factoryMethod.ReaderFactory;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午2:49
 * Desc: 工厂方式模式
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args) {
        ReaderFactory readerFactory;
        Reader reader;
        readerFactory = new GifReaderFactory();
        reader = readerFactory.createReader();
        reader.readPic();


        readerFactory = new JpgReaderFactory();
        reader = readerFactory.createReader();
        reader.readPic();
    }
}
