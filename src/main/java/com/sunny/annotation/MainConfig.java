/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.annotation;

import com.sunny.bean.Blue;
import com.sunny.condition.LinuxConditional;
import com.sunny.condition.WinConditional;
import com.sunny.importing.MyImportSelector;
import com.sunny.xml.bean.Person;
import org.springframework.context.annotation.*;

/**
 * @author zhaoyunxing92
 * @class: com.sunny.annotation.MainConfig
 * @date: 2018-11-22 01:58
 * @des:
 */
@Configuration
@Import({MyImportSelector.class, Blue.class})
public class MainConfig {
    @Bean("person")
    public Person person() {
        System.out.println("-----person init----");
        return new Person("王五", 20);
    }

    @Bean("bill")
    @Conditional(WinConditional.class)
    public Person person01() {

        return new Person("WinConditional", 20);
    }

    @Bean("linux")
    @Conditional(LinuxConditional.class)
    public Person person02() {

        return new Person("LinuxConditional", 30);
    }
}
