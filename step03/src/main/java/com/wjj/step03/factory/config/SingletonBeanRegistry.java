package com.wjj.step03.factory.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
