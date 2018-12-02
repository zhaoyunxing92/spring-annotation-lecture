/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.importing;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhaoyunxing92
 * @date: 2018-12-03 01:02
 * @des: 自定义要导入的组件
 */

public class MyImportSelector implements ImportSelector {
    /**
     * 手动导入Red和blue
     *
     * @param importingClassMetadata
     * @return
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.sunny.bean.Red", "com.sunny.bean.Blue"};
    }
}
