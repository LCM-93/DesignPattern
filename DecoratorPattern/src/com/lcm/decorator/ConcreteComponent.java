package com.lcm.decorator;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/17 下午4:15
 * Desc:
 * *****************************************************************
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}
