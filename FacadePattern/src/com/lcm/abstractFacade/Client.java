package com.lcm.abstractFacade;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2018/7/8 15:00
 * Desc:
 * *****************************************************************
 */
public class Client {


    public static void main(String[] args){

        AbstractFacade facade;

        facade = new FacadeClass01();
        facade.method();

        System.out.println("---------------------------------");

        facade = new FacadeClass02();
        facade.method();
    }
}
