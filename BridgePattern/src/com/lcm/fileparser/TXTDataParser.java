package com.lcm.fileparser;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/9 下午6:00
 * Desc:
 * *****************************************************************
 */
public class TXTDataParser extends DataParser {
    @Override
    public void parseData() {
        String str = dpi.readData();
        System.out.println("Parse "+str+" to TXT");
        System.out.println("---------------------------------------");
    }
}
