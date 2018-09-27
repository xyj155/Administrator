package com.example.admin.dao;

import com.example.admin.bean.UserScan;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserScanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserScan record);

    int insertSelective(UserScan record);

    UserScan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserScan record);

    int updateByPrimaryKey(UserScan record);
}