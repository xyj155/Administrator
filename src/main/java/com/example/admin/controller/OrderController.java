package com.example.admin.controller;

import com.example.admin.bean.Order;
import com.example.admin.serviceImpl.OrderServiceImpl;
import com.example.admin.util.LogUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;

    @RequestMapping("/map")
    public String mapOrder() {
        return "order_map";
    }

    @RequestMapping("/listIndex")
    public String orderList() {
        return "order_list";
    }

    @ResponseBody
    @RequestMapping("/list")
    public Map<String, Object> getOrderList(@RequestParam("num") int pageNum, @RequestParam("size") int pageSize) {
        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(pageNum, pageSize, true);
        List<Order> list = orderService.selectAllOrders();
        PageInfo<Order> userPageResultBean=new PageInfo<Order>(list);
        LogUtil.LogE(userPageResultBean);
        if (list.size() > 0) {
            map.put("code", 200);
            map.put("success", true);
            map.put("size", orderService.selectAllOrders().size());
            map.put("data", userPageResultBean.getList());
        } else {
            map.put("code", 400);
            map.put("success", false);
            map.put("size", 0);
            map.put("data", null);
        }
        return map;
    }
}
