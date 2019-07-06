package com.itmayiedu.demo;

import com.itmayiedu.test01.service.UserServiceTest01;
import com.itmayiedu.test02.service.UserServiceTest02;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo {

    @Autowired
    private UserServiceTest01 userServiceTest01;

    @Autowired
    private UserServiceTest02 userServiceTest02;

    @Test
    public void demo(){
        userServiceTest01.insertUser();
       // userServiceTest01.insertUserMany();
    }

    @Test
    public void demo2(){
         userServiceTest02.insertUser();
      //  userServiceTest02.insertUserMany();
    }
}
