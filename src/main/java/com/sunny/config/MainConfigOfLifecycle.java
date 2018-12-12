/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.config;

import com.sunny.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author zhaoyunxing92
 * @date: 2018-12-10 01:21
 * @des: bean的生命周期
 * 单实例bean的destroy方法是在容器关闭时候调用，但是多实例的bean容器是不会destroy的
 * 1. 定义init和destroy方法 create--- init --- destroy
 * 2. 通过InitializingBean和DisposableBean接口监听bean的生命周期
 * @see com.sunny.bean.Cat
 */
@ComponentScan(basePackages = "com.sunny.bean")
@Configuration
public class MainConfigOfLifecycle {
    /**
     * 指定bean的 init 和 destroy方法
     *
     * @return Car
     */
    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }
}
