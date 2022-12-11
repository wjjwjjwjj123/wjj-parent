package com.wjj.step02.factory;

import com.wjj.step02.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
