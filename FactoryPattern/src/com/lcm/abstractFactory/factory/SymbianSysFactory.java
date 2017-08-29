package com.lcm.abstractFactory.factory;

import com.lcm.abstractFactory.InterfaceCls.InterfaceController;
import com.lcm.abstractFactory.InterfaceCls.SymbianInterfaceController;
import com.lcm.abstractFactory.OperationCls.OperationController;
import com.lcm.abstractFactory.OperationCls.SymbianOperationController;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午4:01
 * Desc:
 * *****************************************************************
 */
public class SymbianSysFactory implements SysFactory {
    @Override
    public InterfaceController createInterface() {
        return new SymbianInterfaceController();
    }

    @Override
    public OperationController createOperation() {
        return new SymbianOperationController();
    }
}
