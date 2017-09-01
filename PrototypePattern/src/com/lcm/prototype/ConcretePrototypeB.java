package com.lcm.prototype;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/1 下午1:45
 * Desc:
 * *****************************************************************
 */
public class ConcretePrototypeB implements Prototype {
    private String atts;

    public String getAtts() {
        return atts;
    }

    public void setAtts(String atts) {
        this.atts = atts;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeB prototypeb = new ConcretePrototypeB();
        prototypeb.setAtts(this.atts);
        return prototypeb;
    }
}
