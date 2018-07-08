package com.lcm.abstractFacade;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2018/7/8 14:56
 * Desc:
 * *****************************************************************
 */
public class FacadeClass01 extends AbstractFacade {

    public FacadeClass01() {
        super();
    }

    @Override
    public void method() {
        system01.method01();
        system02.method02();
        system03.method03();
    }
}
