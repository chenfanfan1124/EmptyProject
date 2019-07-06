package com.imooc.service;

import com.imooc.anno.AdminOnly;
import com.imooc.anno.NeedSecured;
import org.springframework.stereotype.Component;

@Component
@NeedSecured
public class AnnotationService{

    public void demo1(){
        System.out.println("哈哈哈");
        Integer in =10/0;
    }

    @NeedSecured
    public void demo2(){
        System.out.println("嘻嘻嘻");
    }

    public void demo3(User user){
        System.out.println("哗哗哗");
    }
}
