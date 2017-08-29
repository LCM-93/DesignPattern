package com.lcm.abstractFactory.factory;

import com.lcm.abstractFactory.InterfaceCls.AndroidInterfaceController;
import com.lcm.abstractFactory.InterfaceCls.InterfaceController;
import com.lcm.abstractFactory.OperationCls.AndroidOperationController;
import com.lcm.abstractFactory.OperationCls.OperationController;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午4:02
 * Desc:
 * *****************************************************************
 */
public class AndroidSysFactory implements SysFactory {
    @Override
    public InterfaceController createInterface() {
        return new AndroidInterfaceController();
    }

    @Override
    public OperationController createOperation() {
        return new AndroidOperationController();
    }
}
