package com.imooc.service;

import com.imooc.anno.NeedSecured;
import com.imooc.anno.NeedSecured2;
import org.springframework.stereotype.Component;

@Component
public class AnnotationService2 {

    public void demo1(){
        System.out.println("哈哈哈");
    }

    @NeedSecured
    @NeedSecured2
    public void demo2(){
        System.out.println("嘻嘻嘻");
    }

    public void demo3(User user){
        System.out.println("哗哗哗");
    }
}
