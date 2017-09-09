package com.lcm.fileparser;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/9 下午5:59
 * Desc:
 * *****************************************************************
 */
public class SqlServerDataProvider implements DataProviderImp {
    @Override
    public String readData() {
        System.out.println("Connect DB ---- SqlServer");
        System.out.println("Read Data from SqlServer");
        return "Data from SqlServer";
    }
}
