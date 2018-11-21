/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhaoyunxing92
 * @class: com.sunny.annotation.Main
 * @date: 2018-11-22 02:00
 * @des:
 */
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(com.sunny.xml.bean.Main.class);

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Object person = context.getBean("person");

        logger.info("{}", person);
    }
}
