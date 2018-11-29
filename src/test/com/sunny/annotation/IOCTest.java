package com.sunny.annotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author zhaoyunxing92
 * @date: 2018-11-30 01:42
 * @des:
 */
public class IOCTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void person() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("=======================");
        Arrays.asList(beanDefinitionNames).forEach(System.out::println);

    }
}