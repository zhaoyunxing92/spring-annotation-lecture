/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.annotation;

import com.sunny.config.MainConfigOfLifecycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author zhaoyunxing92
 * @date: 2018-12-10 01:31
 * @des:
 */
public class IOCOfBeanLifecycle {
    @Test
    public void beanLifecycle() {
        // 创建ioc
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfLifecycle.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).forEach(System.out::println);

        Object car = context.getBean("car");
        System.out.println("car:" + car.getClass());

        // 关闭ioc
        context.close();
    }
}
