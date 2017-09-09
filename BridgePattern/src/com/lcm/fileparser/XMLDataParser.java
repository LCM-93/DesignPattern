package com.lcm.fileparser;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/9 下午6:01
 * Desc:
 * *****************************************************************
 */
public class XMLDataParser extends DataParser {
    @Override
    public void parseData() {
        String str = dpi.readData();
        System.out.println("Parse "+str+" to XML");
        System.out.println("---------------------------------------");
    }
}
