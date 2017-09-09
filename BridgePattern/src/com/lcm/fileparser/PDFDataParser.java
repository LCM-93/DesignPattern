package com.lcm.fileparser;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/9 下午6:02
 * Desc:
 * *****************************************************************
 */
public class PDFDataParser extends DataParser {
    @Override
    public void parseData() {
        String str = dpi.readData();
        System.out.println("Parse "+str+" to PDF");
        System.out.println("---------------------------------------");
    }
}
