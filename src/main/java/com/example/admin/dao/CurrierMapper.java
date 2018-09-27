package com.example.admin.dao;

import com.example.admin.bean.Currier;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CurrierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Currier record);

    int insertSelective(Currier record);

    Currier selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Currier record);

    int updateByPrimaryKey(Currier record);
}