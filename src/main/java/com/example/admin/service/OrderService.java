package com.example.admin.service;

import com.example.admin.bean.Order;

import java.util.List;

public interface OrderService {
    List<Order> selectAllOrders();
}
