package com.lcm.fileparser;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/9 下午6:02
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args){
        DataParser dataParser;
        DataProviderImp dataProviderImp;

        dataParser = new TXTDataParser();
        dataProviderImp = new OracleDataProvider();
        dataParser.setDpi(dataProviderImp);
        dataParser.parseData();

        dataParser = new XMLDataParser();
        dataProviderImp = new MysqlDataProvider();
        dataParser.setDpi(dataProviderImp);
        dataParser.parseData();

        dataParser = new PDFDataParser();
        dataProviderImp = new SqlServerDataProvider();
        dataParser.setDpi(dataProviderImp);
        dataParser.parseData();
    }
}
