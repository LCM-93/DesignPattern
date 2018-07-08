package com.lcm.facede;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2018/7/8 14:25
 * Desc:
 * *****************************************************************
 */
public class FacadeClass {
    private SubSystem01 system01;
    private SubSystem02 system02;
    private SubSystem03 system03;

    public FacadeClass() {
        system01 = new SubSystem01();
        system02 = new SubSystem02();
        system03 = new SubSystem03();
    }

    public void method(){
        system01.method01();
        system02.method02();
        system03.method03();
    }
}
