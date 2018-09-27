package com.example.admin.controller;

import com.example.admin.bean.TicketSystem;
import com.example.admin.serviceImpl.TicketSystemServiceImpl;
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
@RequestMapping("/ticket")
public class TicketSystemController {
    @Autowired
    private TicketSystemServiceImpl selectAllOrders;

    @RequestMapping("/ticketIndex")
    public String index() {
        return "ticket";
    }

    @ResponseBody
    @RequestMapping("/ticketlist")
    public Map<String, Object> getOrderList(@RequestParam("num") int pageNum, @RequestParam("size") int pageSize) {
        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(pageNum, pageSize, true);
        List<TicketSystem> list = selectAllOrders.getAllTicketSystem();
        PageInfo<TicketSystem> userPageResultBean = new PageInfo<TicketSystem>(list);
        LogUtil.LogE(userPageResultBean);
        if (list.size() > 0) {
            map.put("code", 200);
            map.put("success", true);
            map.put("size", selectAllOrders.getAllTicketSystem().size());
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
