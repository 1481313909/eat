package com.eat.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.eat.mapper.EatMenuMapper;
import com.eat.domain.EatMenu;
import com.eat.service.EatMenuService;
@Service
public class EatMenuServiceImpl implements EatMenuService{

    @Resource
    private EatMenuMapper eatMenuMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return eatMenuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(EatMenu record) {
        return eatMenuMapper.insert(record);
    }

    @Override
    public int insertSelective(EatMenu record) {
        return eatMenuMapper.insertSelective(record);
    }

    @Override
    public EatMenu selectByPrimaryKey(Long id) {
        return eatMenuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(EatMenu record) {
        return eatMenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EatMenu record) {
        return eatMenuMapper.updateByPrimaryKey(record);
    }

}
