/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.annotation;

import com.sunny.xml.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author zhaoyunxing92
 * @class: com.sunny.annotation.MainConfig
 * @date: 2018-11-22 01:58
 * @des:
 */
@Configuration
public class MainConfig {
    @Bean
    @Scope("singleton")
    public Person person() {
        System.out.println("-----person init----");
        return new Person("王五", 20);
    }
}
