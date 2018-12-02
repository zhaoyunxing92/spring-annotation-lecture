/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.config;

import com.sunny.bean.Red;
import com.sunny.importing.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

/**
 * @author zhaoyunxing92
 * @date: 2018-12-03 01:36
 * @des:
 */
@Import({Red.class, MyImportBeanDefinitionRegistrar.class})
public class MyImportBeanDefinitionRegistrarConfig {
}
