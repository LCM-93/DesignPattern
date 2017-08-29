package com.lcm.abstractFactory.factory;

import com.lcm.abstractFactory.InterfaceCls.InterfaceController;
import com.lcm.abstractFactory.InterfaceCls.WindowsInterfaceController;
import com.lcm.abstractFactory.OperationCls.OperationController;
import com.lcm.abstractFactory.OperationCls.WindowsOperationController;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午4:03
 * Desc:
 * *****************************************************************
 */
public class WindowsSysFactory implements SysFactory {
    @Override
    public InterfaceController createInterface() {
        return new WindowsInterfaceController();
    }

    @Override
    public OperationController createOperation() {
        return new WindowsOperationController();
    }
}
