package com.lcm.prototype;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/1 下午1:48
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args){

        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setAtts("Test");

        ConcretePrototypeA clone1 = (ConcretePrototypeA) concretePrototypeA.clone();
        ConcretePrototypeA clone2 = (ConcretePrototypeA) concretePrototypeA.clone();

        System.out.println(clone1==clone2);
        System.out.println(clone1.equals(clone2));
    }
}
