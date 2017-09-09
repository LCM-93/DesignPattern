package com.lcm.fileparser;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/9 下午5:53
 * Desc:
 * *****************************************************************
 */
public class OracleDataProvider implements DataProviderImp {

    @Override
    public String readData() {
        System.out.println("Connect DB ---- Oracle");
        System.out.println("Read Data from Oracle");
        return "Data from Oracle";
    }
}
