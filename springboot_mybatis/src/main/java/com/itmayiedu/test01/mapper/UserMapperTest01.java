package com.itmayiedu.test01.mapper;

import com.itmayiedu.entity.PersonEntity;
import org.apache.ibatis.annotations.Insert;

public interface UserMapperTest01 {
	@Insert("insert into person(name,age,address) values(#{name},#{age},#{address})")
	public int insertPersion(PersonEntity person);
}
