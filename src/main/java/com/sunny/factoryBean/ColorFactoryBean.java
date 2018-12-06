/**
 * Copyright(C) 2018 Hangzhou zhaoyunxing92 Technology Co., Ltd. All rights reserved.
 */
package com.sunny.factoryBean;

import com.sunny.bean.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhaoyunxing92
 * @date: 2018-12-07 01:17
 * @des:
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    /**
     * 返回bean
     *
     * @return Color
     * @throws Exception
     */
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    /**
     * bean 类型
     *
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * 是单列
     *
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
