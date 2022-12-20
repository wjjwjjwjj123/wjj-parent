package com.wjj.step03.factory;

import com.wjj.step03.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
