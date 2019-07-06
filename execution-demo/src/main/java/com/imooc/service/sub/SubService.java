package com.imooc.service.sub;

import com.imooc.log.LogService;
import com.imooc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by cat on 2017-02-19.
 */
@Component
public class SubService extends ProductService{

    @Autowired
    ProductService productService;

    @Autowired
    SubService subService;

    @Autowired
    LogService logService;

    public void demo(){
        System.out.println("execute sub service method");
        Integer in =10/0;
    }

    public void demo2(String name,Integer age){
        System.out.println("姓名："+name+",年龄："+age);


    }
}
