package com.wjj.step02;

public class BeansException extends RuntimeException{

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg , Throwable cause){
        super(msg, cause);
    }
}
