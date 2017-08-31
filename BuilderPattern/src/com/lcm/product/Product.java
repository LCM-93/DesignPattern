package com.lcm.product;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/31 下午4:58
 * Desc:
 * *****************************************************************
 */
public class Product {

    private String name;
    private String price;


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
