package com.itmayiedu.test02.mapper;

import com.itmayiedu.entity.PersonEntity;
import org.apache.ibatis.annotations.Insert;
;

public interface UserMapperTest02 {

	@Insert("insert into person(name,age,address) values(#{name},#{age},#{address})")
	public int insertPersion(PersonEntity person);
}
