package com.example.admin.dao;

import com.example.admin.bean.OrderHistory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderHistory record);

    int insertSelective(OrderHistory record);

    OrderHistory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderHistory record);

    int updateByPrimaryKey(OrderHistory record);
}