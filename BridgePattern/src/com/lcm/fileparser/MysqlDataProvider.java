package com.lcm.fileparser;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/9 下午5:59
 * Desc:
 * *****************************************************************
 */
public class MysqlDataProvider implements DataProviderImp {
    @Override
    public String readData() {
        System.out.println("Connect DB ---- Mysql");
        System.out.println("Read Data from Mysql");
        return "Data from Mysql";
    }
}
