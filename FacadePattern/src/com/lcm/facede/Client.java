package com.lcm.facede;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2018/7/8 14:26
 * Desc:
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args){
//        SubSystem01 subSystem01 = new SubSystem01();
//        SubSystem02 subSystem02 = new SubSystem02();
//        SubSystem03 subSystem03 = new SubSystem03();
//
//        subSystem01.method01();
//        subSystem02.method02();
//        subSystem03.method03();

        FacadeClass facadeClass = new FacadeClass();
        facadeClass.method();
    }
}
