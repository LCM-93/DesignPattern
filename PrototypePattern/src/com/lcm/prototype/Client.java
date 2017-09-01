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

        System.out.println("是否是同一个对象？ "+(clone1==clone2));
        System.out.println("对象的值是否相同？ "+clone1.equals(clone2));
    }
}
