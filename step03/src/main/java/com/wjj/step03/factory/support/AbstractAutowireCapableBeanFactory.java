package com.wjj.step03.factory.support;

import com.wjj.step03.BeansException;
import com.wjj.step03.factory.config.BeanDefinition;

public abstract  class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        addSingleton(beanName,bean);
        return bean;
    }
}
