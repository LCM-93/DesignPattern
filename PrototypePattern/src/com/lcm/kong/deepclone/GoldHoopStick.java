package com.lcm.kong.deepclone;

import java.io.Serializable;

/**
 * ****************************************************************
 * Author:LCM
 * Date: 2017/9/1 下午7:03
 * Desc:
 * *****************************************************************
 */
public class GoldHoopStick implements Serializable {

    private float height = 100.0f;

    private float weight = 50.0f;

    /**
     * 放大  每次放大一倍
     */
    public void grow() {
        height = height * 2;
        weight = weight * 2;
    }

    /**
     * 缩小  每次缩小一半
     */
    public void shrink() {
        height = height / 2;
        weight = weight / 2;
    }
}
