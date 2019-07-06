package com.itmayiedu.entity;

import lombok.Data;

/**
 * 数据库实体-动态多数据源测试
 */
@Data
public class PersonEntity {
    private String name;
    private Integer age;
    private String address;

    public PersonEntity(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
