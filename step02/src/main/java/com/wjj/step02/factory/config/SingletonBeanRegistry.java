package com.wjj.step02.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
