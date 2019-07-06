package cn.inlee.dao;

import cn.inlee.entity.PersonEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonDao {

    @Insert("insert into person(name,age,address) values(#{name},#{age},#{address})")
    public int insertPersion(PersonEntity person);

}
