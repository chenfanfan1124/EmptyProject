package com.imooc;

import com.imooc.log.LogService;
import com.imooc.service.*;
import com.imooc.service.sub.SubService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class demo1 {

    @Autowired
    ProductService productService;

    @Autowired
    SubService subService;

    @Autowired
    LogService logService;

    @Autowired
    AnnotationService annotationService;

    @Autowired
    AnnotationService2 annotationService2;

    @Autowired
    ArgsService argsService;

    @Autowired
    ObjectService objectService;

    @Test
    public void demo1() {
        subService.demo();

    }

    @Test
    public void demo2(){
        productService.getName();
    }

    @Test
    public void demo3(){
        objectService.demo1();
    }

    @Test
    public void demo4(){
        argsService.demo("zhangsan");
    }

    @Test
    public void demo5(){
        argsService.demo2("zhangsan",25);
    }

    @Test
    public void demo6(){
        argsService.demo3("zhangsan",25,"大三汇");
    }

    @Test
    public void demo7(){
        annotationService.demo1();
        System.out.println("aop外面的方法执行了");
    }

    @Test
    public void demo8(){
        annotationService.demo3(new User());
    }

    @Test
    public void demo9(){
        annotationService.demo2();
    }

    @Test
    public void demo10(){
        annotationService2.demo2();
    }

    @Test
    public void demo11(){
        List<String> strings = Arrays.asList("1", "2", "3");

        List<String> strList =new ArrayList<>();
        strList.add("4");
        strList.add("5");


        strList.addAll(strings);
        strList.forEach(System.out::println);



    }
}
