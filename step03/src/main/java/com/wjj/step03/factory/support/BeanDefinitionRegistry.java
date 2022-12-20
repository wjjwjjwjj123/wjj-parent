package com.wjj.step03.factory.support;

import com.wjj.step03.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
