package com.example.admin.controller;

import com.example.admin.bean.User;
import com.example.admin.serviceImpl.UserServiceImpl;
import com.example.admin.util.LogUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @RequestMapping("/loginIndex")
    public String login() {
        return "login";
    }

    @RequestMapping("/usermanager")
    public String userManager() {
        return "usermanager";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> userLogin(HttpServletRequest httpRequest, HttpServletResponse httpServletResponse, @RequestParam("username") String username, @RequestParam("password") String password) {
        Map<String, Object> map = new HashMap<>();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User user1 = service.selectUserByUser(user);
        if (user1 != null) {
            map.put("code", 200);
            map.put("success", true);
            map.put("data", user1);
            Cookie cookie = new Cookie("username", user1.getName());
            cookie.setPath(httpRequest.getContextPath());
            cookie.setMaxAge(60 * 60);
            httpServletResponse.addCookie(cookie);
        } else {
            map.put("code", 400);
            map.put("success", false);
            map.put("data", null);
        }
        return map;
    }

    @ResponseBody
    @RequestMapping("/allusers")
    public Map<String, Object> selectAllUser(@RequestParam("page") int pageNum, @RequestParam("size") int pageSize) {
        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(pageNum, pageSize, false);
        List<User> list = service.selectAllUsers();
        PageInfo<User> userPageResultBean=new PageInfo<User>(list);
        LogUtil.LogE(userPageResultBean);
        if (list.size() > 0) {
            map.put("code", 200);
            map.put("success", true);
            map.put("size", service.selectAllUsers().size());
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
