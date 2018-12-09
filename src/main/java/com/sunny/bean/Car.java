/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.bean;

/**
 * @author zhaoyunxing92
 * @date: 2018-12-10 01:25
 * @des: 测试bean的生命周期
 */
public class Car {
    public Car() {
        System.out.println("car constructor.....");
    }

    public void init() {
        System.out.println("car init.......");
    }

    public void destroy() {
        System.out.println("car destroy ....");
    }
}
