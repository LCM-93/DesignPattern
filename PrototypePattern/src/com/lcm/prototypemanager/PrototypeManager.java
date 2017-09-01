package com.lcm.prototypemanager;

import java.util.Hashtable;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/1 下午8:37
 * Desc:
 * *****************************************************************
 */
public enum PrototypeManager {
    instance;

    private Hashtable<String, Prototype> prototypeHashtable = new Hashtable<>();

    private PrototypeManager() {
        prototypeHashtable.put("CPA",new ConcretePrototypeA("attrs"));
    }

    public void add(String key, Prototype prototype) {
        prototypeHashtable.put(key, prototype);
    }

    public Prototype get(String key) {
        return prototypeHashtable.get(key).clone();
    }
}
