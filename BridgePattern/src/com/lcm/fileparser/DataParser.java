package com.lcm.fileparser;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/9 下午5:52
 * Desc:
 * *****************************************************************
 */
public abstract class DataParser {

    protected DataProviderImp dpi;

    public void setDpi(DataProviderImp dpi) {
        this.dpi = dpi;
    }

    public abstract void parseData();
}
