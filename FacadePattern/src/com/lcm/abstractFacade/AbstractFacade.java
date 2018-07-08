package com.lcm.abstractFacade;

import com.lcm.facede.SubSystem01;
import com.lcm.facede.SubSystem02;
import com.lcm.facede.SubSystem03;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2018/7/8 14:55
 * Desc:
 * *****************************************************************
 */
public abstract class AbstractFacade {
    protected SubSystem01 system01;
    protected SubSystem02 system02;
    protected SubSystem03 system03;

    public AbstractFacade() {
        system01 = new SubSystem01();
        system02 = new SubSystem02();
        system03 = new SubSystem03();
    }

    public abstract void method();
}
