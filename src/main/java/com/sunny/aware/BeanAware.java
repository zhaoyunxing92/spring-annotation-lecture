/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @author zhaoyunxing92
 * @date: 2018-12-17 02:02
 * @des: 获取bean工厂
 * @see org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#initializeBean
 * @see org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#invokeAwareMethods
 */
@Component
public class BeanAware implements BeanFactoryAware {
    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("=======================================");
        this.beanFactory = beanFactory;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }
}
