/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.annotation;

import com.sunny.config.MyImportBeanDefinitionRegistrarConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author zhaoyunxing92
 * @date: 2018-12-03 01:48
 * @des:
 */
public class ImportTest {

    @Test
    public void color() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyImportBeanDefinitionRegistrarConfig.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("=======================");
        Arrays.asList(beanDefinitionNames).forEach(System.out::println);
    }

}
