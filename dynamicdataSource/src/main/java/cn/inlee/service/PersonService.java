package cn.inlee.service;

import cn.inlee.dao.PersonDao;
import cn.inlee.dataSourceAspect.DS;
import cn.inlee.dataSourceConfig.DataSourceContextHolder;
import cn.inlee.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonDao personDao;

    @Transactional
    @DS(DS.dataSourceProvider)
    public void insert(PersonEntity personEntity){
        personDao.insertPersion(personEntity);
    }

    @Transactional
    @DS(DS.dataSourceConsumer)
    public void insert2(PersonEntity personEntity){
        personDao.insertPersion(personEntity);
    }
}
