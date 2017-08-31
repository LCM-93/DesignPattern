package com.lcm.product;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 下午5:02
 * Desc:
 * *****************************************************************
 */
public class Product2Builder extends Builder {
    @Override
    public void buildName() {
        product.setName("product2");
    }

    @Override
    public void buildPrice() {
        product.setPrice("6789");
    }
}
