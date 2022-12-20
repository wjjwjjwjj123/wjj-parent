package com.wjj.step03;

public class BeansException extends RuntimeException{

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg , Throwable cause){
        super(msg, cause);
    }
}
