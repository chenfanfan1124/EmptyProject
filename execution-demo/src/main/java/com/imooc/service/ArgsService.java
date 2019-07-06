package com.imooc.service;

import org.springframework.stereotype.Component;

@Component
public class ArgsService {

    public void demo(String name){
        System.out.println("姓名："+name);
    }

    public void demo2(String name,Integer age){
        System.out.println("姓名："+name+",年龄:"+age);
    }

    public void demo3(String name,Integer age,String addr){
        System.out.println("姓名："+name+",年龄:"+age+",地址:"+addr);
    }
}
