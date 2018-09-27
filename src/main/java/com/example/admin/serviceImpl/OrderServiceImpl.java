package com.example.admin.serviceImpl;

import com.example.admin.bean.Order;
import com.example.admin.dao.OrderMapper;
import com.example.admin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper mapper;

    @Override
    public List<Order> selectAllOrders() {
        return mapper.selectAllOrders();
    }
}
