package com.lcm.abstractFactory.OperationCls;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午4:09
 * Desc:
 * *****************************************************************
 */
public class SymbianOperationController implements OperationController {
    @Override
    public void controlOperation() {
        System.out.println("使用Symbian系统操作控制");
    }
}
