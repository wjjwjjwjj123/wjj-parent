package com.wjj.step02.factory.support;

import com.wjj.step02.BeansException;
import com.wjj.step02.factory.BeanFactory;
import com.wjj.step02.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException{
        Object bean = getSingleton(name);
        if(bean != null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String name) throws BeansException;

    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition) throws BeansException;
}
