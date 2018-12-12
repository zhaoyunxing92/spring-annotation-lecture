/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhaoyunxing92
 * @date: 2018-12-13 01:23
 * @des:
 */
@Component
public class Dog {
    public Dog() {
        System.out.println("dog constructor....");
    }

    //对象创建并赋值之后调用
    @PostConstruct
    public void init() {
        System.out.println("dog... @PostConstruct");
    }

    //容器移除对象前
    @PreDestroy
    public void destroy() {
        System.out.println("dog ...    @PreDestroy....");
    }

}
