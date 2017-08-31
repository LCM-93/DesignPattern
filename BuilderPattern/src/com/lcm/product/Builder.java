package com.lcm.product;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 下午4:59
 * Desc:
 * *****************************************************************
 */
public abstract  class Builder {

    protected Product product = new Product();

    public abstract void buildName();

    public abstract void buildPrice();

    public Product createProduct(){
        this.buildName();
        this.buildPrice();
        return product;
    }
}
