package com.example.admin.service;

import com.example.admin.bean.User;

import java.util.List;

public interface UserService {

    User selectByPrimaryKey(int key);

    User selectUserByUser(User user);

    List<User> selectAllUsers();
}
