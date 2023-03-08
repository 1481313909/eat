package com.eat.service;

import com.eat.domain.EatMenu;
public interface EatMenuService{


    int deleteByPrimaryKey(Long id);

    int insert(EatMenu record);

    int insertSelective(EatMenu record);

    EatMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EatMenu record);

    int updateByPrimaryKey(EatMenu record);

}
