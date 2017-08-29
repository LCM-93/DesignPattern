package com.lcm.abstractFactory.OperationCls;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/8/29 下午4:10
 * Desc:
 * *****************************************************************
 */
public class AndroidOperationController implements OperationController {
    @Override
    public void controlOperation() {
        System.out.println("使用Android系统操作控制");
    }
}
