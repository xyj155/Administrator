package com.example.admin.serviceImpl;

import com.example.admin.bean.User;
import com.example.admin.dao.UserMapper;
import com.example.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public User selectByPrimaryKey(int key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public User selectUserByUser(User user) {
        return mapper.selectUserByUser(user);
    }

    @Override
    public List<User> selectAllUsers() {
        return mapper.selectAllUsers();
    }
}
