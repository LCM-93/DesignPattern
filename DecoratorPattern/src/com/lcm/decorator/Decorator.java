package com.lcm.decorator;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/17 下午4:17
 * Desc:
 * *****************************************************************
 */
public class Decorator extends Component {
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
