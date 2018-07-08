package com.lcm.abstractFacade;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2018/7/8 14:59
 * Desc:
 * *****************************************************************
 */
public class FacadeClass02 extends AbstractFacade {
    SubSystem04 system04;

    public FacadeClass02() {
        super();
        system04 = new SubSystem04();
    }

    @Override
    public void method() {
        system01.method01();
        system02.method02();
        system04.method04();
        system03.method03();
    }
}
