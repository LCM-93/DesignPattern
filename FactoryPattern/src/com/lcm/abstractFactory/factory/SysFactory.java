package com.lcm.abstractFactory.factory;

import com.lcm.abstractFactory.InterfaceCls.InterfaceController;
import com.lcm.abstractFactory.OperationCls.OperationController;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午3:57
 * Desc:
 * *****************************************************************
 */
public interface SysFactory {

    InterfaceController createInterface();

    OperationController createOperation();
}
