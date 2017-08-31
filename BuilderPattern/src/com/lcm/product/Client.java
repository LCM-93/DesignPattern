package com.lcm.product;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 下午5:03
 * Desc:
 * *****************************************************************
 */
public class Client {
    public static void main(String[] args) {
        Product product;
        Builder builder;

        builder = new Product1Builder();

        product = builder.createProduct();

        System.out.println(product.toString());
    }
}
