package com.example.admin.dao;

import com.example.admin.bean.Daily;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DailyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Daily record);

    int insertSelective(Daily record);

    Daily selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Daily record);

    int updateByPrimaryKey(Daily record);
}