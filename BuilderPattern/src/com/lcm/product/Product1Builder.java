package com.lcm.product;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 下午5:01
 * Desc:
 * *****************************************************************
 */
public class Product1Builder extends Builder {
    @Override
    public void buildName() {
        product.setName("product1");
    }
    @Override
    public void buildPrice() {
        product.setPrice("1234");
    }
}
