/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.config;

import com.sunny.factoryBean.ColorFactoryBean;
import org.springframework.context.annotation.Bean;

/**
 * @author zhaoyunxing92
 * @date: 2018-12-10 01:01
 * @des:
 */
public class MyConfig {
    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
