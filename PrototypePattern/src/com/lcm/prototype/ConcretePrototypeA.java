package com.lcm.prototype;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/1 下午1:45
 * Desc:
 * *****************************************************************
 */
public class ConcretePrototypeA implements Prototype {
    private String atts;

    public String getAtts() {
        return atts;
    }

    public void setAtts(String atts) {
        this.atts = atts;
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "atts='" + atts + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ConcretePrototypeA) {
            ConcretePrototypeA concretePrototypeA = (ConcretePrototypeA) obj;
            return atts.equals(concretePrototypeA.getAtts());
        }
        return super.equals(obj);
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setAtts(this.atts);
        return prototypeA;
    }
}
