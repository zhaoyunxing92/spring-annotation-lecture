/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.importing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhaoyunxing92
 * @date: 2018-12-03 01:02
 * @des: 自定义要导入的组件
 */
public class MyImportSelector implements ImportSelector {
    /**
     * Select and return the names of which class(es) should be imported based on
     * the {@link AnnotationMetadata} of the importing @{@link Configuration} class.
     *
     * @param importingClassMetadata
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[0];
    }
}
