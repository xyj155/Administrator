package com.example.admin.dao;

import com.example.admin.bean.TicketSystem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TicketSystemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TicketSystem record);

    int insertSelective(TicketSystem record);

    TicketSystem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TicketSystem record);

    int updateByPrimaryKey(TicketSystem record);

    List<TicketSystem> getAllTicketSystem();
}