/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.annotation;

import com.sunny.config.MyConfig;
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

    @Test
    public void colorFactoryBean() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("=======================");
        Arrays.asList(beanDefinitionNames).forEach(System.out::println);

        //根据id获取到的bean是工厂bean的getObject()创建的bean
        /**
         * @see com.sunny.factoryBean.ColorFactoryBean#getObject
         */
        Object colorBean = context.getBean("colorFactoryBean");
        System.out.println("bean的类型：" + colorBean.getClass());

        /**
         * 要想获取工厂bean本身需要在id前加&符号
         * @see org.springframework.beans.factory.BeanFactory#FACTORY_BEAN_PREFIX
         */

        Object factoryBean = context.getBean("&colorFactoryBean");
        System.out.println("bean的类型：" + factoryBean.getClass());
    }

}
