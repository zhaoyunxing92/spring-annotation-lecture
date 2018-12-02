/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.importing;

import com.sunny.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhaoyunxing92
 * @date: 2018-12-03 01:34
 * @des:
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * @param importingClassMetadata 当前类的注解信息
     * @param registry               注册bean
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        /**
         * 是否有 red bean
         */
        boolean red = registry.containsBeanDefinition("com.sunny.bean.Red");
        if (red) {
            System.out.println("-------registry rainbow --------");
            // 注册bean,指定bean的定义
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);

            registry.registerBeanDefinition("rainBow", beanDefinition);
        }
    }
}
