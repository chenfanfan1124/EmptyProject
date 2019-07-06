package cn.inlee;


import cn.inlee.dataSourceAspect.DS;
import cn.inlee.dataSourceConfig.DataSourceContextHolder;
import cn.inlee.entity.PersonEntity;
import cn.inlee.service.PersonService;
import org.json.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test1 {

    @Autowired
    private PersonService PersonService;

    @Test
    public void test(){
        PersonEntity personEntity = new PersonEntity("zhangsan",1000,"sanhui");
        PersonService.insert(personEntity);
        PersonService.insert2(personEntity);
    }



}
