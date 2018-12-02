package com.sunny.annotation;

import com.sunny.xml.bean.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author zhaoyunxing92
 * @date: 2018-11-30 01:42
 * @des:
 */
public class IOCTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void color() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("=======================");
        Arrays.asList(beanDefinitionNames).forEach(System.out::println);
    }


    @Test
    public void person() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("=======================");
        Arrays.asList(beanDefinitionNames).forEach(System.out::println);
    }

    /**
     * 根据条件注入对应的bean
     * @Conditional
     */
    @Test
    public void person01() {

        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        System.out.println("=======================");
        Arrays.asList(beanNamesForType).forEach(System.out::println);

        //获取全部的person
        Map<String, Person> persions = context.getBeansOfType(Person.class);
        System.out.println(persions);
    }
}