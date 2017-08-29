package com.lcm.abstractFactory.client;

import com.lcm.abstractFactory.InterfaceCls.InterfaceController;
import com.lcm.abstractFactory.OperationCls.OperationController;
import com.lcm.abstractFactory.factory.SymbianSysFactory;
import com.lcm.abstractFactory.factory.SysFactory;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午4:14
 * Desc: 抽象工厂模式
 * *****************************************************************
 */
public class Client {

    public static void main(String[] args) {
        SysFactory sysFactory;
        InterfaceController interfaceController;
        OperationController operationController;

        sysFactory = new SymbianSysFactory();
        interfaceController = sysFactory.createInterface();
        operationController = sysFactory.createOperation();

        interfaceController.controlInterface();
        operationController.controlOperation();
    }
}
